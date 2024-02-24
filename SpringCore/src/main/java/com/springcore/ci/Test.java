<<<<<<< HEAD
package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p = (Person)context.getBean("person");
		
		System.out.println(p);
		
		Addition a =(Addition)context.getBean("add");
		a.dosum();
	}

}
=======
package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p = (Person)context.getBean("person");
		
		System.out.println(p);
		
		Addition a =(Addition)context.getBean("add");
		a.dosum();
	}

}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
