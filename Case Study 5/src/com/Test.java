package com;

import registration.Registrar;
import university.Student;
import university.Subject;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
Student student=new Student("Dheepak","Mathematics",24);
	
		
		
		
		Student s2=new Student("Harish","Biology",29);
	
		
		 Student s3=new Student("Divya","Physics",27);
	
		
		 Student s4=new Student("Ravi","Computer Science",28);
	

		
		 Student s5=new Student("Akshay","Chemistry",20);
      System.out.println("Admitted Students are");
      int i=1;
    	  for(String s:Registrar.set){
			System.out.println(i+"."+s);
    		  i++;
    	  }

	}

}
