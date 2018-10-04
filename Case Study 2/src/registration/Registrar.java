package registration;

import java.text.DecimalFormat;

import university.Student;

public class Registrar {
static int  id=0;
	private Registrar() {

	}

	public static Registrar getRegistar() {
		return new Registrar();
	}

	public String registerStudent(Student student) {
	
		Validator validator = Validator.getValidator();
		if (validator.validateStudentDetails(student) == true) {
			System.out.println("Student registered successfully");
			System.out.println("Name : "+student.getName());
			//student.setReference(id)
			id++;
			DecimalFormat df=new DecimalFormat("0000");
					String k=df.format(id);
					String admissionID="CTS"+k;
			
			return admissionID;
		} 
		
		return null;

	}

}
