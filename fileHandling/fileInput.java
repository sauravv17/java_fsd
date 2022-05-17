package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInput {
	public static void main(String[] args) {
			try {
				FileInputStream fis =new FileInputStream("D:\\\\training\\\\java_fsd\\\\out\\\\testout.txt");
				int i=0;
				while((i=fis.read())!=-1) {
					System.out.print((char)i);
				}
			}
				catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
}
}

