package university;

@SuppressWarnings("serial")
public class Subject extends Student{
	public void addSubject(String subject){
		//Registrar rs=Registrar.getRegistar();
switch(subject){
case "Mathematics": System.out.println("Registered to Mathematics"); break;
case "Physics": System.out.println("Registered to Physics"); break;
case "Chemistry": System.out.println("Registered to Chemistry"); break;
case "Accountancy": System.out.println("Registered to Accountancy"); break;
case "Computer Science": System.out.println("Registered to Computer Science"); break;
case "Biology": System.out.println("Registered to Biology"); break;
}
/*System.out.println("Do you need to change the subject....... type yes or no");
String f=s.nextLine();
if(f.equals("yes")) {
	Subject sb3=new Subject();
sb3.removeSubject();
}*/
	}
	
	public void removeSubject(){
		//Registrar rs=Registrar.getRegistar();
		Subject sb2=new Subject();
			setSubjectName(null);
			System.out.println("Subject removed");
			System.out.println("Add a new subject");
			setSubjectName(s.nextLine());
		System.out.println("Registered to "+sb2.getSubjectName());
	
	}
}
