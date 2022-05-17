package fileHandling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedStream {

	public static void main(String[] args) {
		testBufferOutput();
	}

	private static void testBufferOutput() {
		try {
			FileOutputStream fos=new FileOutputStream("D:\\\\training\\\\java_fsd\\\\out\\\\testout2_dec.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String s="Testing buffered output";
			byte[] b=s.getBytes();
			bos.write(b);
			bos.flush();
			bos.close();
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
