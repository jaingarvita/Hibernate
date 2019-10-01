package com.zensar.hibernate.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Customer cu = s.get(Customer.class, 3);
		System.out.println(cu.getCustomerId());
		System.out.println(cu.getAddress());
		System.out.println(cu.getGender());
		System.out.println(cu.getBirthDate());
		System.out.println(cu.getAge());
		System.out.println(cu.getCustomerName());

		Name customerName = cu.getCustomerName();
		Blob customerPhoto = cu.getProfilePhoto();
		try {
			InputStream im = customerPhoto.getBinaryStream();
			int data =0;
			
			FileOutputStream fout = new FileOutputStream("./Resources/newPhoto.jpg");
			while((data=im.read()) != -1)
			{
				fout.write(data);
			}
			
			Clob description = cu.getDescription();
			Reader r = description.getCharacterStream();
			PrintWriter pw = new PrintWriter("./Resources/customerdbimport.txt");
			int charData =0;
			while ((charData=r.read()) != -1) {
				pw.print((char)charData);
				
			}
r.close();
pw.close();
			t.commit();
			s.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
