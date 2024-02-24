<<<<<<< HEAD
package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//this is init function
		System.out.println("taking pepsi: init");
	}

	@Override
	public void destroy() throws Exception {
		// this is destroy function
		System.out.println("giving back the bottle: destroy");
		
	}
	
	
	
}
=======
package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//this is init function
		System.out.println("taking pepsi: init");
	}

	@Override
	public void destroy() throws Exception {
		// this is destroy function
		System.out.println("giving back the bottle: destroy");
		
	}
	
	
	
}
>>>>>>> 4efed25b0e512d50bf1a291a4a349be7f9da6b93
