package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList2 {
	private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int size=5;
		List<Integer> l2=new ArrayList<Integer>();
		System.out.println("enter "+size+ "integer");
		for(int i=0;i<size;i++) {
			l2.add(sc.nextInt());
		}
		System.out.println(l2);
	}

}
