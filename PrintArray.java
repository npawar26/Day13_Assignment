package com.bridgelabz.generics;
import java.util.Arrays;

public class PrintArray<T> {

	public static <E> void testMaximum(E[] inputArray){
		PrintArray.toPrint(inputArray);

	}

	public static <E> void toPrint (E[] inputArray) {
		System.out.println("Maximum element is: "+inputArray[3]);
	}


	public static void main(String[] args) {

		Integer[] a= {8,4,5,6};
		Arrays.sort(a);
		PrintArray.testMaximum(a);  

		String[] s = {"Apple","Peach","Banana","cat"};
		Arrays.sort(s);
		PrintArray.testMaximum(s);

		Float[] f = {23.34f,9.50f,11.70f,10.20f};
		Arrays.sort(f);
		PrintArray.testMaximum(f);
	}



}


