<<<<<<< HEAD
package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaconfig.xml");
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("-----------------");
		System.out.println(p1.getFeestructure());
		System.out.println(p1.getFeestructure().getClass().getName());
		System.out.println("-----------------");
		System.out.println(p1.getProperties());
	}

}
=======
package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaconfig.xml");
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("-----------------");
		System.out.println(p1.getFeestructure());
		System.out.println(p1.getFeestructure().getClass().getName());
		System.out.println("-----------------");
		System.out.println(p1.getProperties());
	}

}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
