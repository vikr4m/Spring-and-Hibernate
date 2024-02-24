<<<<<<< HEAD
package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	public Person(String name,int personid, Certi certi) {
		this.name = name;
		this.personid = personid;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name+" : "+ this.personid+" : "+ this.certi.name;
	}
	
}
=======
package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	public Person(String name,int personid, Certi certi) {
		this.name = name;
		this.personid = personid;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name+" : "+ this.personid+" : "+ this.certi.name;
	}
	
}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
