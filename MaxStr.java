package com.bridgelabz.generics;

public class MaxStr {


	public static <T extends Comparable<T>> T getMaxStr(T x,T y,T z)
	{

		T maximum = x; 

		if (y.compareTo(maximum) > 0)
			maximum = y; 

		if (z.compareTo(maximum) > 0)
			maximum = z; 
		System.out.println("Maximum of three String's is: "+maximum);

		return maximum; 
	}

	public static void main(String[] args) {

		MaxStr.getMaxStr("Apple","Peach","Banana");
	}

}
