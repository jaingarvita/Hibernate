package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entity.Product;

//Hibernate Query Language(Object oriented query language)
public class HQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();

		// Singleton and heavy weight session factory
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		// JPA-Java Persistent API Query
		// Query q = s.createQuery("from Product");
		// List<Product> product = q.getResultList();
//	 for (Product products : product) {
//		 System.out.println(products);
//	 }
//		
		/*
		 * Query q =
		 * s.createQuery("from Product p where p.price >20000 an p.price<80000");
		 * List<Product> product = q.getResultList(); for (Product products : product) {
		 * System.out.println(products); }
		 */

		/*
		 * Query q =
		 * s.createQuery("from Product p where p.price between 20000 and 80000 ");
		 * List<Product> product = q.getResultList(); for (Product products : product) {
		 * System.out.println(products); }
		 */
		/*
		 * Query q = s.createQuery("from Product p where p.brand like 'S%'");
		 * List<Product> product = q.getResultList(); for (Product products : product) {
		 * System.out.println(products); }
		 */

		/*
		 * Query q = s.createQuery("from Product p where p.name='Mobile'");
		 * List<Product> product = q.getResultList(); for (Product products : product) {
		 * System.out.println(products); }
		 */

		/*
		 * Query q = s.createQuery("select p.name , p.price from Product p");
		 * List<Object[]> objects = q.getResultList(); for (Object[] ob : objects) {
		 * 
		 * for (int i = 0; i < ob.length; i++) { System.out.println(ob[i]); }
		 * 
		 * }
		 */

		/*
		 * Query q1 = s.createQuery("select max (p.price) from Product p"); Double
		 * maxPrice= (Double) q1.getSingleResult(); System.out.println(maxPrice);
		 */

		/*
		 * Query q2 = s.createQuery("select min(p.price)from Product p"); Double
		 * minPrice = (Double) q2.getSingleResult(); System.out.println(minPrice);
		 */

		
		/*
		 * Query q3 = s.createQuery("select sum(p.price)from Product p"); Double
		 * sumPrice = (Double) q3.getSingleResult(); System.out.println(sumPrice);
		 */
		
		
		/*
		 * Query q4 = s.createQuery("select avg(p.price)from Product p"); Double
		 * avgPrice = (Double) q4.getSingleResult(); System.out.println(avgPrice);
		 */
		
	
		Criteria cr = s.createCriteria("Product.class");
	List<Product> products = cr.list();
			for (Product p : products);
				System.out.println(products);
		
		
		
		
		
		t.commit();
		s.close();
	}

}
