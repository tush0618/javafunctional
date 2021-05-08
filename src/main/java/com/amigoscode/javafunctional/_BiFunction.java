package com.amigoscode.javafunctional;

import java.util.function.BiFunction;

public class _BiFunction {

	//BiFunction<T,U,R>	Represents a function that accepts two arguments and produces a result.
	public static void main(String[] args) {
		
		//Calling normal method with 2 arguments
		int a = incBy1AndMul(5, 100);
		System.out.println(a);
 
		//Calling BiFunction i.e. passing 2 arguments
		int b  = biIncBy1andMulByY.apply(5, 100);
		System.out.println(b);
	}
	
	//Note: The methods below should be static to be called directly without object creation
	
	static int incBy1AndMul(int x, int y)
	{
		return Math.multiplyExact((x+1), y);
	}
	
	
	static BiFunction<Integer, Integer, Integer> biIncBy1andMulByY = 
			(x,y) -> Math.multiplyExact((x+1), y);

}
