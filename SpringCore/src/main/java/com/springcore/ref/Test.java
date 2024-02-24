<<<<<<< HEAD
package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A temp = (A)context.getBean("aref");
		System.out.println(temp.getX());
		
		System.out.println(temp.getOb().getY());
	}

}
=======
package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A temp = (A)context.getBean("aref");
		System.out.println(temp.getX());
		
		System.out.println(temp.getOb().getY());
	}

}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
