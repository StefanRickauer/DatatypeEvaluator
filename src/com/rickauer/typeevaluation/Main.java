package com.rickauer.typeevaluation;

public class Main {
	public static void main(String[] args) {
		byte 	byteTest 	= 1;
		short 	shortTest 	= 1;
		int 	intTest 	= 1;
		long 	longTest 	= 1;
		float 	floatTest 	= 1.0f;
		double 	doubleTest 	= 1.0;
		boolean booleanTest = true;
		char 	charTest 	= '1';
		String 	objectTest 	= "I am a String, but also an Object";
		
		DatatypeEvaluator.evaluateDatatype(byteTest);
		DatatypeEvaluator.evaluateDatatype(shortTest);
		DatatypeEvaluator.evaluateDatatype(intTest);
		DatatypeEvaluator.evaluateDatatype(longTest);
		DatatypeEvaluator.evaluateDatatype(floatTest);
		DatatypeEvaluator.evaluateDatatype(doubleTest);
		DatatypeEvaluator.evaluateDatatype(booleanTest);
		DatatypeEvaluator.evaluateDatatype(charTest);
		DatatypeEvaluator.evaluateDatatype(objectTest);
	}
}
