package examination;

import examination.Evaluator;

public class Paper {
	public String submit(){
		Evaluator evaluator=Evaluator.getEvaluator();
		return evaluator.Evaluate(this);
	}
}
