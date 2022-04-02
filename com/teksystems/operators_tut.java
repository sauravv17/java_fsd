package com.teksystems;

public class operators_tut {
	
	public static void main(String[] args) {
		int result=1+2;
		result=result*10;
		int rem=result%2;
		System.out.println(result);
		System.out.println(rem);
		
		result++;
		result--;
		result +=2;
		result /=3;
		
		System.out.println(result);
		
		boolean isTemp= true;
		if (isTemp) {
			System.out.println("Temp VAlue");
		}
		
		int topScore=100;
		if (topScore<100) {
			System.out.println("less");
		}else {
		System.out.println("equal");
		}
		
		
		int age =20;
		if (age<20) {
			System.out.println("Wait");
		}else {
			System.out.println("can");
		}
		//ternary operator
		int age1=18;
		boolean isCarAvailable=true;
		String message=(age1>20) ? (isCarAvailable) ? "Can rent car" : "no car" : "wait for a while";
		System.out.println(message);	
		
	
}
}
