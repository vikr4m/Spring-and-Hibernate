<<<<<<< HEAD
package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//To make a spring core application without using XML file
public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1 = context.getBean("getStudent",Student.class);
		System.out.println(s1);
		s1.study();
		
	}
}
=======
package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//To make a spring core application without using XML file
public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s1 = context.getBean("getStudent",Student.class);
		System.out.println(s1);
		s1.study();
		
	}
}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
