package com.teksystems;

public class string_tut {
	public static void main(String[] args) {
		String s1="hello"; //string is an object, immutable
		String s2= s1+ " world";
		System.out.println(s1);
		System.out.println(s2);
		
		
		String s3="45";
		int myint =Integer.parseInt(s3); // string to integer
		
		System.out.println(s3);
		
		int x=10;
		String s4= s1 + x;
		System.out.println(s4); //concatenation
		
		String s5= "45x";
		try {
			int int2 =Integer.parseInt(s5);
		} catch(Exception ex) {
			System.out.println("Faied"+ex.getMessage());
		}
		
	}

}
