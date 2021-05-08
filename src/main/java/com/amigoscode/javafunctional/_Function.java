package com.amigoscode.javafunctional;

import java.util.function.Function;

public class _Function {

	
	
	/* Why use this Function instead of normal method ????? -- will learn in extended video
	 * 
	 * Function<T,R> where T & R is the Data type of i/p & o/p respectively.
	 * Represents a function that accepts one argument and produces a result.
	 */
	public static void main(String[] args) {

		//Calling normal increment method
		int inc = increment(3);
		System.out.println(inc);

		//Calling incNumByOne Function - apply() takes the argument to the function
		int inc2 = incNumByOne.apply(3);
		System.out.println(inc2);
		
		//Calling multiplyBy10 Function - apply() takes the argument to the function
		int mul = multiplyBy10.apply(5);
		System.out.println(mul);
		
		//Calling the chained function
		int combi = incAndThenMul.apply(5);
		System.out.println(combi);
	}

	//Both the increment and Function 1 are same :)
	static int increment(int i) {
		return Math.addExact(i, 1);
	}
	
	
	//Function 1
	static Function<Integer, Integer> incNumByOne = 
			n -> Math.addExact(n, 1) ;
	
	//Function 2
	static Function<Integer, Integer> multiplyBy10 = 
			n -> Math.multiplyExact(n, 10);

	//F1 & F2 Chaining
	static Function<Integer, Integer> incAndThenMul = 
			incNumByOne.andThen(multiplyBy10);

}
