package com.bridgelabz.generics;

public class GenericMethod {

	public static <T extends Comparable<T>> T allDataPrint(T x,T y,T z) {

		T maximum = x; 

		if (y.compareTo(maximum) > 0)
			maximum = y; 

		if (z.compareTo(maximum) > 0)
			maximum = z; 
		System.out.println("Maximum of three is: "+maximum);

		return maximum; 
	}

	public static void main(String[] args) {

		GenericMethod.allDataPrint(9,10,11);
		GenericMethod.allDataPrint(9.50,10.20,11.70);
		GenericMethod.allDataPrint("Apple","Peach","Banana");

	}

}
