package com.bridgelabz.generics;

public class MultipleMax {

	public static <T extends Comparable<T>> T allDataPrint(T x,T y,T z,T k) {

		T maximum = x; 

		if (y.compareTo(maximum) > 0)
			maximum = y; 

		if (z.compareTo(maximum) > 0)
			maximum = z; 

                                           if (k.compareTo(maximum) > 0)
			maximum = k; 
		System.out.println("Maximum of three is: "+maximum);

		return maximum; 
	}

	public static void main(String[] args) {

		MultipleMax.allDataPrint(9,10,11,20);
		MultipleMax.allDataPrint(9.50,10.20,11.70,2.5);
		MultipleMax.allDataPrint("Apple","Peach","Banana","cat");

	}

}
