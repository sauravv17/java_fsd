package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testOutput {
	public static void main(String[] args) {
			
			try {
				FileOutputStream fos=new FileOutputStream("D:\\\\training\\\\java_fsd\\\\out\\\\testout.txt");
				String s="Hello From Java";
				fos.write(s.getBytes());
				fos.close();
				System.out.println("End");
			} 
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		
	}
}
