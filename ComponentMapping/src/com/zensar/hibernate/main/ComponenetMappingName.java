package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponenetMappingName {
	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		Name name = new Name();
		name.setFirstName("Garvita");
		name.setMiddleName("M");
		name.setLastName("Jain");
		Customer cu = new Customer();
		cu.setCustomerId(3);
		cu.setCustomerName(name);

		cu.setGender("Female");
		cu.setAge(21);
		cu.setAddress("Indore");
		cu.setBirthDate(LocalDate.of(1998, 01, 29));
		try {
			File photo = new File("./Resources/photo.jpg");
			FileInputStream fil = new FileInputStream(photo);

			Blob customerPhoto = BlobProxy.generateProxy(fil, photo.length());
			cu.setProfilePhoto(customerPhoto);

			File fil2 = new File("./Resources/customerimport.txt");
FileReader fr = new FileReader(fil2);
Clob description = ClobProxy.generateProxy(fr, fil2.length());
cu.setDescription(description);
			s.save(cu);
			t.commit();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
