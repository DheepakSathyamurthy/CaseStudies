package examination;

import examination.Evaluator;
import examination.Paper;

public class Evaluator {
	private static Evaluator evaluator=null;
	private Evaluator(){
			
		}
		public static Evaluator getEvaluator(){
		if(evaluator==null){
			evaluator=new Evaluator();
		}
		return evaluator;
		}
		String Evaluate(Paper paper){
			return "Pass";
		}
}
