package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

//		FileInputStream fis = null;
		
		try (FileInputStream fis = new FileInputStream("a.txt")){
			
			System.out.println("read");
			
		} catch (FileNotFoundException e) { // 파일이 없는경우
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // close가 안될 경우
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
