package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mapping.xml.Person;

public class CriteriaExample {
	public static void main(String[] args) {
		Session s= new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria c = s.createCriteria(Person.class);
		
		//c.add(Restrictions.eq("address", "ahmedabad")); where statements
		//c.add(Restrictions.gt("id", 4));	greater than
		c.add(Restrictions.like("address","a%"));	//like statements
		
		List<Person> persons = c.list();
		for(Person p:persons) {
			System.out.println(p);
		}
		
		s.close();
	}
}
