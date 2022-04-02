package arrayList;

import java.util.ArrayList;
import java.util.List;

public class testArrayList {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<String>();
		strList.add("Hello");
		strList.add("world");
		
		System.out.println(strList);
		
		List<Integer> l1=new ArrayList<Integer>();
		for (int i=0;i<20;i++) {
			l1.add(i);
		}
		System.out.println(l1);
		
		for (int j:l1) {
			System.out.println(j);
		}
	}
}
