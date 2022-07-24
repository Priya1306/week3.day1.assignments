package org.college;

public class Student extends Department{
	public void studentName() {
		System.out.println("Anamika");
	}
	public void studentDept() {
		System.out.println("Computer Science");
	}
	public void studentID() {
		System.out.println("001");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentID();
		s.studentDept();
	}

}
