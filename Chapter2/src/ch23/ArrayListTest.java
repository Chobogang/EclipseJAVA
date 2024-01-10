package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library  = new ArrayList<Book>();
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
	
		for (int i = 0; i < library.size(); i++) { //size() 는 배열안에 들어가 있는 원소의 갯수, length()는 배열의 크기 
 			library.get(i).showInfo();
		}
	}
	

}
