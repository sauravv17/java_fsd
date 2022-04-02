package com.teksystems;

import java.util.Scanner;

public class userInput_tut {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("name");
		String name=scanner.nextLine();
		System.out.println("name entered  " + name);
		scanner.close();
	}

}
