<<<<<<< HEAD
package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	private Samosa samosa;
	
	public void study() {
		System.out.println("studying");
		this.samosa.display();
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	
	
	
	
}
=======
package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	private Samosa samosa;
	
	public void study() {
		System.out.println("studying");
		this.samosa.display();
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
	
	
	
	
}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
