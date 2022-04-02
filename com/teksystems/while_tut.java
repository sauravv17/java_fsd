package com.teksystems;

public class while_tut {
	public static void main(String[] args) {
		int count =0;
		while (count !=5) {
			System.out.println("count is "+count);
			count++;
		}
		
		count=6;
		do {
			System.out.println("count is "+count);
			count++;
		}while (count<20);
	}
}
