package com.bridgelabz.generics;

public class GenericClass<T extends Comparable<T>> {

	private T x=null;
	private T y=null;
	private T z=null;

	public GenericClass(T x,T y,T z) {
		this.x=x;
		this.y=y;
		this.z=z;

	}

	public void testMaximum () {

		T maximum = x; 

		if (y.compareTo(maximum) > 0)
			maximum = y; 

		if (z.compareTo(maximum) > 0)
			maximum = z; 
		System.out.println("Maximum of three is: "+maximum);

	}

	public static void main(String[] args) {
		GenericClass<Integer> myint=new GenericClass<Integer>(2, 6, 9);
		GenericClass<Float> myfloat=new GenericClass<Float>(9.50f,10.20f,11.70f);
		GenericClass<String> mystring=new GenericClass<String>("Apple","Peach","Banana");

		myint.testMaximum();
		myfloat.testMaximum();
		mystring.testMaximum();


	}


}
