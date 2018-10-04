package registration;

import exception.AgeException;
import exception.NameException;
import exception.NoSeatException;
import exception.SubjectException;
import exception.ValidatorException;
import university.Student;

public class Validator {
	private static Validator validator=null;
	// static int totalSeats=2;
	private Validator() {

	}

	public static Validator getValidator() {
		if(validator==null){
			validator=new Validator();
		}
		return validator;
	}

	public  boolean validateStudentDetails(Student student,int seats) throws ValidatorException{
		if((student.getStudentName().equals(null) || student.getStudentName().trim().length()==0) )
		{
			throw new NameException("Name not available");
		}
		if((student.getSubjectName().equals(null) || student.getSubjectName().trim().length()==0) ){
			throw new SubjectException("No subject selected");
		}
		
			if(student.getAge()<23 || student.getAge()>35){
				throw new AgeException("Age must be within 23 and 35");
			}
			if(seats<=0){
				throw new NoSeatException("No seats available");
			}
			return true;
	}
}
