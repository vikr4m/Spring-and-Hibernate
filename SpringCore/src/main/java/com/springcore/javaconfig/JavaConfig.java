<<<<<<< HEAD
package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	@Bean
	public Samosa getSamosa(){
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		//creating a new object
		Student student = new Student(getSamosa());
		return student;
	}
}
=======
package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	@Bean
	public Samosa getSamosa(){
		return new Samosa();
	}
	
	@Bean
	public Student getStudent() {
		//creating a new object
		Student student = new Student(getSamosa());
		return student;
	}
}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
