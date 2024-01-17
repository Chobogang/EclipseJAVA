package ch08;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj) {
			throw new Exception(); // exception 강제 발생 
		} catch(Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
	}

}
