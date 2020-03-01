package com.epam.Calculator;

public class MathsOperations {
	
	//Implement only addition operation  (DRY Principle)
	public static double add(double num1, double num2) {
		double added_value;
		added_value = num1 + num2;
		return added_value;
	}
	
	//Implement only multiplication operation  (DRY Principle)
	public static double multiply(double num1, double num2) {
		double multiplied_value;
		multiplied_value = num1 * num2;
		return multiplied_value;
	}
	
	//Implement only subtraction operation  (DRY Principle)
	public static double subtract(double num1, double num2) {
		double subtracted_value;
		subtracted_value = num1 - num2;
		return subtracted_value;
	}
	
	//Implement only divide operation (DRY Principle)
	public static double divide(double num1, double num2) {
		double divided_value;
		double val1 = (double) num1;
		double val2 = (double) num2;
		divided_value = val1/val2;
		return divided_value;
	}
	
	//According to the given task no need to implement square root, Cosine function, Sine function etc. (Obeys YAGINI Principle)
}
