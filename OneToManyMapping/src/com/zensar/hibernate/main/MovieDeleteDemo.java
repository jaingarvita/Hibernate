package com.zensar.hibernate.main;

import java.util.List;

/**
 * @author Garvita Jain
 * @Creation_date 27 September 2019 5:52PM
 * @Modification_Date 27 September 2019 5:52PM
 * @version 1.0
 * @copyright Zensar Technologies.All rights reserved
 * @description This is  Class
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		Movie m = s.get(Movie.class, 4);
		System.out.println(m.getTitle());
		System.out.println(m.getReleaseDate());
		List<Song> songs = m.getSong();
		for (Song song : songs)

		{
			System.out.println(song);
		}

		if (m != null) {
			s.delete(m);
			System.out.println("Sorry ! Movie not found");
		}

		t.commit();
		s.close();

	}

}
