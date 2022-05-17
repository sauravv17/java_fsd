package fileHandling;

import java.io.IOException;

public class project {
	public static void main(String[] args) throws IOException {
		System.out.println("This is output");
		System.err.println("This is error");
		
		int i=System.in.read();
		System.out.println((char)i);
		
	}
}
