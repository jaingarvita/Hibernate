package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappingMain {
	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		Country ct = new Country();
		ct.setName("India");
		ct.setLanguage("Hindi");
		ct.setPopulation(1300000l);

		Flag fg = new Flag();
		fg.setFlagName("Tiranga");

		fg.setDescription("India is my country");
		ct.setFlag(fg);
		fg.setCountry(ct);
		s.save(ct);
		s.save(fg);
		t.commit();
		s.close();
		System.exit(0);
	}
}
