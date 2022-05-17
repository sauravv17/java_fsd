package fileHandling;

import java.util.Scanner;

public class writeUserInput {
	public static void main(String[] args) {
		
		String s=getUserInput();
		writeToFile("D:\\\\training\\\\java_fsd\\\\out\\\\testout2_dec.txt", s);
	}

	private static void writeToFile(String filePath, String greetingsMes) {
		try {
			FileWriter fw =new FileWriter(filePath,true);
			
		}
		
	}

	private static String getUserInput() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter name");
		String name =scanner.nextLine();
		String mes="Greetings"+ name +"welcome";
		scanner.close();
		return mes;
		
	}

}
