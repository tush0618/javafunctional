package com.amigoscode.javafunctional;

import java.util.function.Supplier;

public class _Supplier {

	//Supplier<T> Represents a supplier of results. In Supplier we don't pass the arguments
	//Use is just to return a value
	public static void main(String[] args) {
		
	//Calling Normal Method
	System.out.println(getJdbcUrl());
	
	//Calling Supplier Method
	System.out.println(suppGetJdbcUrl.get());

	}

	//Normal Method: to return a jdbc URL
	static String getJdbcUrl()
	{
		return "jdbc://localhost:3306/users";
	}
	
	//Supplier Method for similar function
	static Supplier<String> suppGetJdbcUrl = () -> "jdbc://localhost:3306/users";
	
}
