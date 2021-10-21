package com.codingdojo.calculator;

public class CalculatorTest {
	
	public static void main (String args []) {
		
		Calculator.setOperandOne(10);
		Calculator.setOperandTwo(5.2);
		Calculator.setOperation("-");
		
		Calculator.performOperation();
		Calculator.getResults();
		
		
		
	}

}
