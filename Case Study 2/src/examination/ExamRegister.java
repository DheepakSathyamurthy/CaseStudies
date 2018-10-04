package examination;

import university.Student;

public class ExamRegister {
	private ExamRegister(){
		
	}
	public static ExamRegister getExamRegister(){
		return new ExamRegister();
	}
	public Exam registerStudentForExamination(Student student){
		Paper paper=new Paper();
		Exam exam= new Exam(paper);
		return exam;
	}


}
