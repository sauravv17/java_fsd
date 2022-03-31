package arrays_tut;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		int[] arr1= {11,12,13,14,15,16,17};
		System.out.println(Arrays.toString(arr1));
		int [] arr2 = {0,0,0,0,0,0,0};
		for (int i=arr1.length-1;i>=0;i--) {
			System.out.println(arr1[i]);
			arri[i]=arr2[arr1.length-i];
			System.out.println(Arrays.toString(arr2));
			//System.out.println(arr1[i]);
		}
	}

}
