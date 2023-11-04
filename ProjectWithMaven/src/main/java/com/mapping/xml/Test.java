package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Person person = new Person(101,"Vikram","Anand","123456");
		
		Student student = new Student();
		student.setStudentName("vikram");
		student.setAbout("anand");
		student.setStudentId(101);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(person);
		
		
		tx.commit();
		session.close();
		
		factory.close();
	}

}
