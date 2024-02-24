<<<<<<< HEAD
package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/awconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp");
		System.out.println(emp1);
	}

}
=======
package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/awconfig.xml");
		Emp emp1 = (Emp) context.getBean("emp");
		System.out.println(emp1);
	}

}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
