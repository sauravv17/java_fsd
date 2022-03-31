package arrays_tut;

import java.util.Scanner;

public class ArrayProg {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [] myInt = getInt(5);
		//printMyInt(myInt);
		//int avg=getAvg(myInt);
		//System.out.println("Average of array is "+avg);
	}

	private static int[] getInt(int mum) {
		// TODO Auto-generated method stub
		System.out.println("Enter " + num + " integer values.\n");
		int[] val =new int[num];
		for (int i=0;i<myInt.length;i++) {
			val[i]=sc.nextInt();
		}
		return val;
	}

}
