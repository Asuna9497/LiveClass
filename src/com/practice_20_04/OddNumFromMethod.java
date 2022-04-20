package com.practice_20_04;

import java.util.Scanner;

public class OddNumFromMethod {
	
	//Write a program and create method to print first 100 odd number.
	
	/**
	 * This method will print the odd numbers
	 * @param limit
	 */
	public void getOddNumbers(int num) {
		//to get first odd numbers you have to iterate twice
		//e.g if want first 2 odd numbers you have to iterate for 4 times
		int limit = num*2;
		
		for (int i = 1; i <= limit; i++) {
			if (i % 2 == 0) {
				continue; //to skip the even number
			} else {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		//take limit from user
		Scanner sc = new Scanner(System.in);
		System.out.println("how many first odd numbers you want?");
		int num = sc.nextInt();
		
		//create an object of class
		OddNumFromMethod oddNumFromMethod = new OddNumFromMethod();
		//invoke method to print odd numbers
		oddNumFromMethod.getOddNumbers(num);
		
	}

}
