package com.practice_20_04;

import java.util.Scanner;

public class AritmeticCalculator {

	// defined constants for operations
	private static final int sum = 1;
	private static final int subtraction = 2;
	private static final int multiplication = 3;
	private static final int division = 4;

	public static void main(String[] args) {

		int num1;
		int num2;
		int operation;
		boolean wantToContinue = false;
		Scanner sc = new Scanner(System.in);

		// used do-while to continue the operation chain
		do {
			// taking user inputs
			System.out.println("Enter first number:");
			num1 = sc.nextInt();

			System.out.println("Enter second Number: ");
			num2 = sc.nextInt();

			System.out.println("enter operation number you want to perform:(for sum= 1, sub=2, multi =3, div=4) :");
			operation = sc.nextInt();

			switch (operation) {
			case sum: {
				int sum = num1 + num2;
				System.out.println("sum = " + sum);
				wantToContinue = wantToContinue();
				break;
			}
			case subtraction: {
				int sub = num1 - num2;
				System.out.println("subtraction = " + sub);
				wantToContinue = wantToContinue();
				break;
			}
			case multiplication: {
				int multi = num1 * num2;
				System.out.println("Multiplication = " + multi);
				wantToContinue = wantToContinue();
				break;
			}
			case division: {
				int div = num1 / num2;
				System.out.println("divisions = " + div);
				wantToContinue = wantToContinue();
				break;
			}
			default:
				System.out.println("no defined operation, please enter correct one");
				wantToContinue = wantToContinue();
				break;
			}
		} while (wantToContinue);

	}

	/**
	 * This method will ask user if they want to continue with operations
	 * 
	 * @return true/false
	 */
	private static boolean wantToContinue() {
		// used try with resource
		Scanner sc = new Scanner(System.in);
		System.out.println("you want to perform other operations? Enter Yes/No");
		if (sc.next().equalsIgnoreCase("Yes")) {
			return true;
		} else {
			return false;
		}
	}

}
