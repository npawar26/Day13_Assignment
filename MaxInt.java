package com.bridgelabz.generics;

public class MaxInt {

	public static <T extends Comparable<T>> T getMaxInt(T x,T y,T z)
	{

		T maximum = x; 

		if (y.compareTo(maximum) > 0)
			maximum = y; 

		if (z.compareTo(maximum) > 0)
			maximum = z; 
		System.out.println("Maximum of three integers is: "+maximum);

		return maximum; 
	}

	public static void main(String[] args) {

		MaxInt.getMaxInt(9,10,11);
	}


}
