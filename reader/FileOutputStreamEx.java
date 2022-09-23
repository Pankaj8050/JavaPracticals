package reader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream outputStream = new FileOutputStream("D:\\Sample.txt",true);
		String str = "Hello Guys, this is Pankaj";
		byte[] bArr = str.getBytes();
		outputStream.write(bArr);
		outputStream.close();
		System.out.println("File Created ");
		
		

	}

}
