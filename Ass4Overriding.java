package week3.day1;

public class Ass4Overriding {
	public void getStudentInfo(int id) {
		System.out.println("Student Id is " +id);

	}

	public void getStudentInfo(int id, String name) {

		System.out.println("The student Id is " +id +" and "+ "the student name is "+name);
	}

	private void getStudentInfo(String email, Long phoneNO) {
		System.out.println("The student Id is " +email +" and "+ "the student name is " +phoneNO);
	}

	public static void main(String[] args) {
		Ass4Overriding overriding = new Ass4Overriding();
		overriding.getStudentInfo(11);
		overriding.getStudentInfo(22, "Test1");
		overriding.getStudentInfo("Test@gmail.com", 123456789L);

	}

}
