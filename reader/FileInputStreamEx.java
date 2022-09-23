package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("D:\\Sample.txt");
		int i = 0;
		while((i = inputStream.read())!= -1) {
			System.out.print((char)i);
		}
       
		inputStream.close();
	}

}
