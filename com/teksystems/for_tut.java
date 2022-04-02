package com.teksystems;

public class for_tut {
	public static void main(String[] args) {
		//find all prime numbers between 10 and 40 and calculate the count 
		int count=0;
		for (int j=10;j<=40;j++) {
			if (findPrime(j)) {
				count+=1;
			}
			if (count==4) {
				break;
			}
		}
		System.out.println("total " + count);
		
	}
	
	public static boolean findPrime(int num) {
		if (num==1) {
			return false;
		}
	for (int i =2; i<=num/2; i++) {
		if (num%i ==0) 
			return false;
	}
	System.out.println(num);
	return true;
	}

}
