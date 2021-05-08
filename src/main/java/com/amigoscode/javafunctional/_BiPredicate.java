package com.amigoscode.javafunctional;

import java.util.HashMap;
import java.util.function.BiPredicate;

public class _BiPredicate {

	//BiPredicate<T,U>	Represents a predicate (boolean-valued function) of two arguments.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm  = new HashMap<>();
		hm.put("IND", "INDIA");
		hm.put("PAK", "PAKISTAN");
		hm.put("US", "SRI LANKA");
		
		hm.forEach((code, name) -> System.out.println(isValidCountryCode.test(code,name)));
 	}

	
	//BiPredicate - Pass two args and return a boolean
	static BiPredicate<String, String> isValidCountryCode = (code, name) -> name.contains(code);
	

}
