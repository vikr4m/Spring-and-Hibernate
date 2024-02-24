<<<<<<< HEAD
package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		//To use spring expression language (rarely used method)
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("45+45");
		System.out.println(expression.getValue());
	}
}
=======
package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		//To use spring expression language (rarely used method)
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("45+45");
		System.out.println(expression.getValue());
	}
}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
