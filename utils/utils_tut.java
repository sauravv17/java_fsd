package utils;

import java.util.Arrays;
import java.util.List;

public class utils_tut {
	public static void main(String[] args) {
		String[]strary =new String[] {"Raj","Anam"};
		List<String> strings =Arrays.asList(strary);
		System.out.println(strings);
		
		strings.set(0,"John");
		System.out.println("strings"+strings);
		System.out.println("strary"+Arrays.toString(strary));
		Arrays.sort(strary);	
		System.out.println(Arrays.toString(strary));
	}
}
