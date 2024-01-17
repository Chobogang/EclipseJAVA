package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		try(FileOutputStream fow = new FileOutputStream("output.txt")){
			
			fow.write(65);
			fow.write(66);
			fow.write(67);
			
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
