package regex;

import java.util.regex.Pattern;

public class regex_tut {
	public static void main(String[] args) {
		regexTest1();
	}

	private static void regexTest1() {
		System.out.println(Pattern.matches(".n", "an"));// 2letter word ending with n
		System.out.println(Pattern.matches("..n", "aan"));// 3letter word ending with n
		System.out.println(Pattern.matches(".n.", "ana"));// 3letter word ending n on 2nd position
		System.out.println(Pattern.matches("[amn]", "n"));//any one of the word present in bracket
	}
}
