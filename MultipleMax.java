package com.bridgelabz.generics;

import java.util.Arrays;

public class MultipleMax<T>{


	public static <E> void testMaximum(E[] inputArray){

		System.out.println("Maximum element is: "+inputArray[3]);
	}

	public static void main(String[] args) {
		Integer[] a= {8,4,5,6};
		Arrays.sort(a);
		MultipleMax.testMaximum(a);

		String[] c = {"Apple","Peach","Banana","cat"};
		Arrays.sort(c);
		MultipleMax.testMaximum(c);

		Float[] f = {23.34f,9.50f,11.70f,10.20f};
		Arrays.sort(f);
		MultipleMax.testMaximum(f);
	}

}

