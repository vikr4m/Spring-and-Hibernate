package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
//		Samosa s1 = (Samosa) context.getBean("S1");
//		System.out.println(s1);
		context.registerShutdownHook();
//		
//		System.out.println("--------------");
//		Pepsi p1 = (Pepsi) context.getBean("P1");
//		System.out.println(p1);
		
		Cake c1 = (Cake)context.getBean("c1");
		System.out.println(c1);
	}

}
