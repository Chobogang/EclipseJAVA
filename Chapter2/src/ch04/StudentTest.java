package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee =  new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
	}
}