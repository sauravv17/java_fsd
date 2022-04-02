package arrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class linkedList {
	public static void main(String[] args) {
		List<String> ll1 =new LinkedList<String>();
		ll1.add("h");
		ll1.add("e");
		ll1.add("l");
		ll1.add("l");
		ll1.add("o");
		
		printList(ll1);
		//printList2(ll1);
		//printList(ll1);
	}


	private static void printList(List<String> ll1) {
		Iterator<String> it = ll1.iterator();
		
		while (it.hasNext()) {
			String ele=it.next();
			if (ele.equalsIgnoreCase("e")){
				it.remove();
			}
			
		}
		
	}
}
