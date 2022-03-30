package com.teksystems;

public class typecasting_tut {
	public static void main(String[] args) {
		//implicit
		
		System.out.println("Implicit Typecasting");
		char a='A';
		System.out.println("Value of a is "+a);
		
		int b=a;
		System.out.println("Value of b is "+b);
		
		float c=a;
		System.out.println("Value of c is "+c);
		
		long d=a;
		System.out.println("Value of d is "+d);
		
		double e=a;
		System.out.println("Value of e is "+e);
		
		
		System.out.println("\n");
		
		//explicit
		System.out.println("Explicit Typecasting");
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x is" +x);
		System.out.println("Value of y is" +y);
		
		
		
	}

}
