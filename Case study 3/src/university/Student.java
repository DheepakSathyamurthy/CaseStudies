package university;

import java.util.Date;
import java.util.Scanner;
import examination.Exam;
import examination.ExamRegister;
import examination.Paper;
import exception.UniversityException;
import registration.Registrar;

public class Student {
	private String studentName; 
	private String maritalstatus;
	private int age;
	private String sex;
    private Date dob;
	private String address;
	private String primaryemail;
	private String secondaryemail;
	private String phoneno;
	private String highesteduq;
	private String nationality;
	//private int reference;
	private String result;
	Exam exam;
	 boolean status;
	private  String admissionID;
	protected String subjectName;
	
	Scanner s=new Scanner(System.in);
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public  String getAdmissionID(){
		return admissionID;
	}
	 
	 public  String admissionID(){
		 return admissionID;
	 }
	 
	/* public void run(){
				try {
					registerStudent();
				} catch (UniversityException e) {
					// TODO Auto-generated catch block
					System.out.println("Registration failed due to "+e);
				}
	 }*/
	 

public Student(String name, String subjectName, int age) {
		studentName=name;
		this.subjectName=subjectName;
		this.age=age;
    try {
		registerStudent();
	} catch (UniversityException e) {
		// TODO Auto-generated catch block
		System.out.println("Registration failed due to "+e);
		endStatement();
	}
	}
public Student(){
	
}

	/*	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}*/
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getStudentName() {
		return studentName;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPrimaryemail() {
		return primaryemail;
	}
	public void setPrimaryemail(String primaryemail) {
		this.primaryemail = primaryemail;
	}
	public String getSecondaryemail() {
		return secondaryemail;
	}
	public void setSecondaryemail(String secondaryemail) {
		this.secondaryemail = secondaryemail;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getHighesteduq() {
		return highesteduq;
	}
	public void setHighesteduq(String highesteduq) {
		this.highesteduq = highesteduq;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void registerStudent() throws UniversityException{
		Registrar register=Registrar.getRegistar();
		admissionID=register.registerStudent(this);
		if(admissionID!=null){
		System.out.println("Admission Id: "+admissionID);
		Subject sb=new Subject();
		sb.addSubject(subjectName);
		registerForExam();
		}
		else{
			System.out.println("Registration process Failed");
			endStatement();
		}
	}
	public void registerForExam(){

		ExamRegister examregister=ExamRegister.getExamRegister();
		exam=examregister.registerStudentForExamination(this);
		System.out.println("Registered for Exam successfully");
		appearForExam();
	}

	
	/*public Student(String name, String maritalstatus, int age, String sex, Date dob, String address,
			String primaryemail, String secondaryemail, String phoneno, String highesteduq, String nationality) {
		super();
		this.name = name;
		this.maritalstatus = maritalstatus;
		this.age = age;
		this.sex = sex;
		this.dob = dob;
		this.address = address;
		this.primaryemail = primaryemail;
		this.secondaryemail = secondaryemail;
		this.phoneno = phoneno;
		this.highesteduq = highesteduq;
		this.nationality = nationality;
	}*/
	public void appearForExam(){
	
		Paper paper=exam.getPaper();
		setResult(paper.submit());
		System.out.println("Result: "+getResult());
		endStatement();
		}
	public void endStatement(){
		System.out.println("-------------------------------End of Statement--------------------------------");
	}

}
