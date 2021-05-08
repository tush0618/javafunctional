package com.amigoscode.javafunctional;

import java.util.function.Predicate;

public class _Predicate {

	//Predicate<T> Represents a predicate (boolean-valued function) of one argument.
	public static void main(String[] args) {
		
		//Normal - InValid
		System.out.println(isPhoneNumValid("9999999"));
		//Normal - Valid
		System.out.println(isPhoneNumValid("9999999999"));
		
		//Calling Predicate - Invalid Num
		System.out.println(predIsPhoneValid.test("88888"));
		
		//Calling Predicate - Valid Num
		System.out.println(predIsPhoneValid.test("9888888888"));

		//Predicate Chaining using "and"
		System.out.println(predIsPhoneValid.and(predPhnNumHas3).test("9888888883"));
	}
	
	//Normal Method for phone validation
	static boolean isPhoneNumValid (String phone)
	{
		return phone.startsWith("9") && (phone.length() == 10);
	}
	
	//Predicate 1
	static Predicate<String> predIsPhoneValid = s -> s.startsWith("9") && (s.length() == 10);

	//Predicate 2
	static Predicate<String> predPhnNumHas3 = s -> s.contains("3");
}
