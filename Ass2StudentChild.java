package week3.day1;

public class Ass2StudentChild extends Ass2DepartmentParent {
	public void studentName() {
		System.out.println("studentName-Ass2StudentChild");
	}
	public void studentDept() {
		System.out.println("studentDept-Ass2StudentChild");
	}
	public void studentId() {
		System.out.println("studentDept-Ass2StudentChild");

	}

	public static void main(String[] args) {
		Ass2StudentChild child = new Ass2StudentChild();
		child.studentName();
		child.studentDept();
		child.studentId();
		child.deptName();
		child.collegeName();
		child.collegeCode();
		child.collegeRank();


	}

}
