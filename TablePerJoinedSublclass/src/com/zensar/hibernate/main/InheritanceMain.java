package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		Employee e = new Employee();
		e.setName("Garvita");
		e.setJoiningDate(LocalDate.of(1998, 01, 29));
		e.setSalary(25000);

		s.save(e);

		WageEmp we = new WageEmp();
		we.setName("Avani");
		we.setJoiningDate(LocalDate.of(26, 03, 15));
		we.setHours(72);
		we.setRate(250.0f);
		we.setSalary(50000);
		s.save(we);
		
	
		t.commit();
		s.close();

	}

}
