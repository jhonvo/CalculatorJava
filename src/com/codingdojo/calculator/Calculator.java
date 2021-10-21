package com.codingdojo.calculator;

public class Calculator {
	private static double operandOne;
	private static double operandTwo;
	private static double results;
	private static String operation;
	
	public Calculator () {

	}
	
	public static void setOperandOne(double val) {
		operandOne = val;
	}
	
	public static void setOperation(String val) {
		operation = val;
	}
	
	public static void setOperandTwo(double val) {
		operandTwo = val;
	}
	
	public static void performOperation() {
		if (operation == "+") {
			results = operandOne + operandTwo;
		}
		else if (operation == "-") {
			results = operandOne - operandTwo;
		}
		else {
			System.out.println("Operation is not valid");
		}
		
	}
	
	public static void getResults() {
		System.out.println("The result is: " + results);
	}
	
}
