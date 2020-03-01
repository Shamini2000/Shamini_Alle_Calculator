package com.epam.Calculator;

import java.util.Scanner;

public class Calculator {
	
	static Scanner sc = new Scanner(System.in);
	public static int count;
	public static double num1;
	public static boolean flag;
	
	public static void takeInput() {
		count = 0;
		num1 = 0;
		flag = true;
		while(flag) {
			System.out.println("Enter the value 1.addition 2.substraction 3.multiply 4.divide 5.exit");
			int val = sc.nextInt();
			count++;
			if(val >= 5 || val <= 0) {
				break;
			}
			double num2;
			if(count == 1) {
				System.out.println("Enter the numbers");
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
			} else {
				System.out.println("Enter the number");
				num2 = sc.nextDouble();
			}
			num1 = performOperations(num1, num2, val);
			System.out.println("Result = " + num1);
		} 
	}
	
	
	public static double performOperations(double num1, double num2, int val) {
		MathsOperations math_operations = new MathsOperations();
		switch(val) {
		case 1:
			num1 = math_operations.add(num1, num2);
			break;
		case 2:
			num1 = math_operations.subtract(num1, num2);
			break;
		case 3:
			num1 = math_operations.multiply(num1, num2);
			break;
		case 4:
			num1 = math_operations.divide(num1, num2);
			break;
		case 5:
			flag = false;
			break;
		default:
			System.out.println("Enter valid input");
			break;
		} return num1;

	}

}
