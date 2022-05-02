package com.bridgelabz.generics;

public class MaxFloat {

	public static <T extends Comparable<T>> T getMaxFloat(T x,T y,T z)
	{

		T maximum = x; 

		if (y.compareTo(maximum) > 0)
			maximum = y; 

		if (z.compareTo(maximum) > 0)
			maximum = z; 
		System.out.println("Maximum of three float's is: "+maximum);

		return maximum; 
	}

	public static void main(String[] args) {

		MaxFloat.getMaxFloat(9.50,10.20,11.70);
	}

}