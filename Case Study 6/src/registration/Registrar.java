package registration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.Set;
import java.util.TreeSet;

import exception.RegistrationException;
import registration.Registrar;
import registration.Validator;
import university.Student;

public class Registrar {
	private static Registrar registrar=null;
	static int  id=0;
	static int totalSeats=6;
	public static Set<String> set=new TreeSet<>();
	public static Integer t=1;
	private Registrar() {

	}

	public static Registrar getRegistar() {
		if(registrar==null){
			registrar=new Registrar();
		}
		return registrar;
	}

	public  String registerStudent(Student student) throws RegistrationException, Exception{
	
		Validator validator = Validator.getValidator();
		if (validator.validateStudentDetails(student,totalSeats) == true) {

			System.out.println("Student registered successfully");
			System.out.println("Name : "+student.getStudentName());
			set.add(student.getStudentName());
			try{
				String z="D://StudentDetails"+t;
				t++;
			File f=new File(z+".txt");
			FileOutputStream file=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(file);
			oos.writeObject(student);
			oos.close();
			file.close();
			}
			catch(Exception e){
				System.out.println("Failed due to "+e);
//				e.printStackTrace();
			}
			
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
