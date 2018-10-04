package com;

public class Evaluator {
	private Evaluator(){
		
	}
	public static Evaluator getEvaluator(){
		return new Evaluator();
	}
	String Evaluate(Paper paper){
		return "Pass";
	}

}
