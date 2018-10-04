package examination;

import university.Student;

public class ExamRegister {
	private static ExamRegister examRegister=null;
private ExamRegister(){
		
	}
	public static ExamRegister getExamRegister(){
		if(examRegister==null){
			examRegister=new ExamRegister();
		}
		return examRegister;
	}
	public Exam registerStudentForExamination(Student student){
		Paper paper=new Paper();
		Exam exam= new Exam(paper);
		return exam;
	}
}
