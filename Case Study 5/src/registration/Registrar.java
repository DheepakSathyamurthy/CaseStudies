package registration;

import java.text.DecimalFormat;
import java.util.Set;
import java.util.TreeSet;

import exception.RegistrationException;
import university.Student;

public class Registrar {
	private static Registrar registrar=null;
	static int  id=0;
	static int totalSeats=6;
	public static Set<String> set=new TreeSet<>();
	private Registrar() {

	}

	public static Registrar getRegistar() {
		if(registrar==null){
			registrar=new Registrar();
		}
		return registrar;
	}

	public  String registerStudent(Student student) throws RegistrationException{
	
		Validator validator = Validator.getValidator();
		if (validator.validateStudentDetails(student,totalSeats) == true) {

			System.out.println("Student registered successfully");
			System.out.println("Name : "+student.getStudentName());
			set.add(student.getStudentName());
			
			//student.setReference(id)
			id++;
			DecimalFormat df=new DecimalFormat("0000");
					String k=df.format(id);
					String admissionID="CTS"+k;
			totalSeats--;
			//System.out.println("Total seats remaining : "+totalSeats);
			return admissionID;
		} 
		
		return null;

	}
}
