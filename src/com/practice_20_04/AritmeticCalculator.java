package com.practice_20_04;

import java.util.Scanner;

public class AritmeticCalculator {
	
	private static final int sum = 1;
	private static final int subtraction = 2;
	private static final int multiplication = 3;
	private static final int division = 4;

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int operation;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		
		System.out.println("Enter second Number: ");
		num2 = sc.nextInt();
		

		System.out.println("enter operation number (sum= 1, sub=2, multi =3, div=4) you want to perform: ");
		operation = sc.nextInt();
		
		switch (operation) {
		case sum: {
			int sum = num1+num2;
			System.out.println("sum = "+ sum);
			break;
		}
		case subtraction: {
			int sub = num1-num2;
			System.out.println("subtraction = "+ sub);
			break;
		}
		case multiplication: {
			System.out.println("sum = "+ num1*num2);
			break;
		}
		case division: {
			System.out.println("sum = "+ num1%num2);
			break;
		}
		default:
			System.out.println("no defined operation, please enter correct one");
			break;
		}
	}

}
