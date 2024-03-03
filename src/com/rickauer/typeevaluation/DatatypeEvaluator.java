package com.rickauer.typeevaluation;

public final class DatatypeEvaluator {
	
	private DatatypeEvaluator() {
		throw new UnsupportedOperationException("Utility class is not supposed to be instanciated.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(byte input) {
		System.out.println("I am a byte.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(short input) {
		System.out.println("I am a short.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(int input) {
		System.out.println("I am an int.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(long input) {
		System.out.println("I am a long.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(float input) {
		System.out.println("I am a float.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(double input) {
		System.out.println("I am a double.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(boolean input) {
		System.out.println("I am a boolean.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(char input) {
		System.out.println("I am a char.");
	}
	
	@SuppressWarnings("unused")
	public static void evaluateDatatype(Object input) {
		System.out.println("I am a Object.");
	}
}
