package registration;

import university.Student;

public class Validator {
	private Validator(){
		
	}
	public static Validator getValidator(){
		return new Validator();
	}
	
	public boolean validateStudentDetails(Student student){
		if((student.getName().equals(null) || student.getName().trim().length()==0) || (student.getSubjectName().equals(null) || student.getSubjectName().trim().length()==0) )
		{
			return false;
		}
			return true;
		
	}

}
