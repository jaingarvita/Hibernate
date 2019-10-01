package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zensar.entity.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();

		// Singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		// insert new record
		// Product p = new Product(125, "MI TV", "MI", 125000.00);
		// s.save(p);
		// get record according to primary key
		// Product p = s.load(Product.class,1006);
//		Product p = s.get(Product.class, 1003);
//		if (p != null) {
//			System.out.println(p);
//		} else {
//			System.out.println("product not found");
//		}

//date a record
//		Product p = s.get(Product.class, 1005);
//		if (p != null) {
//			p.setPrice(20000);
//			s.update(p);
//		} else {
//			System.out.println("product not found");
//		}

//		Product p = s.get(Product.class, 1002);
//		if (p != null) {
//			double up = p.getPrice();
//			p.setPrice(up + 5000);
//			s.update(p);
//		} else {
//			System.out.println("product not found");
//		}
		Product p = s.get(Product.class, 1002);
		if (p != null) {
			
		s.delete(p);
			
		} else {
		System.out.println("product not found");
	}

		t.commit();
		s.close();

	}
}
