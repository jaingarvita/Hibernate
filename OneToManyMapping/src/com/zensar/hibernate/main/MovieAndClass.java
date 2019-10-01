package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Garvita Jain
 * @Creation_date 27 September 2019 5:10PM
 * @Modification_Date 27 September 2019 5:10PM
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

public class MovieAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		Movie m = new Movie();
		m.setTitle("URI");

		m.setReleaseDate(LocalDate.of(1998, 01, 01));

		Song s1 = new Song();
		s1.setName("JAI HIND");

		Song s2 = new Song();
		s2.setName("JAI ho");

		Song s3 = new Song();
		s3.setName("JAI BHARAT");

		s1.setMovie(m);
		s2.setMovie(m);
		s3.setMovie(m);

		List<Song> song = new ArrayList<>();
		song.add(s1);
		song.add(s2);
		song.add(s3);
		m.setSong(song);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(m);

		t.commit();
		s.close();

	}

}
