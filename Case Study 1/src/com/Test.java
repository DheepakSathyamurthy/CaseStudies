package com;

public class Test {

	public static void main(String[] args) {
		
		Student student=new Student("Dheepak");
		//student.setName("Dheepak");
		student.registerStudent();
		student.registerForExam();
		student.appearForExam();
		
		Student s2=new Student("Harish");
		//s2.setName("Harish");
		s2.registerStudent();
		s2.registerForExam();
		s2.appearForExam();
		
		Student s3=new Student("Priya");
	//	s3.setName("");
		s3.registerStudent();
		s3.registerForExam();
		s3.appearForExam();
	//	System.out.println(student.getAdmissionID());

		Student s4=new Student("Ravi");
		//s2.setName("Harish");
		s4.registerStudent();
		s4.registerForExam();
		s4.appearForExam();
		

	}

}
