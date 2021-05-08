package com.amigoscode.javafunctional;

import java.util.function.Consumer;

public class _Consumer {

	//Consumer<T> Represents an operation that accepts a single input argument and returns no result.
	public static void main(String[] args) {

		//Calling Normal method for printing Customer
		greet(new Customer("Ami", "9999999999"));

		//Calling Consumer method for printing Customer
		consumerGreet.accept(new Customer("Josh", "8888888888"));

	}

	//Normal Method with no return type
	static void greet(Customer c)
	{
		System.out.println("Hello! "+ c.getName() + " " + c.getPhone());
	}

	//Consumer Method with nothing to return
	static Consumer<Customer> consumerGreet = 
			c -> System.out.println("Hello! "+ c.getName() + " " + c.getPhone());

}

class Customer
{
	private String name;
	private String phone;
	public Customer(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
