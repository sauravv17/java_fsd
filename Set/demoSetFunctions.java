package Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class demoSetFunctions {
	public static void main(String[] args) {
		NavigableSet<Integer> setOfInts=new TreeSet<Integer>();
		setOfInts.add(25);
		setOfInts.add(5);
		setOfInts.add(2);
		setOfInts.add(74);
		
		System.out.println(setOfInts);
		System.out.println(setOfInts.lower(74));
		System.out.println(setOfInts.ceiling(74));
		System.out.println(setOfInts.higher(74));
		System.out.println(setOfInts.floor(74));
		
	}
}
