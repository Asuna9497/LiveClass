package com.practice_20_04;

import java.util.Scanner;

public class SquareAndCubeMethods {	
	// Write a program to create a method for finding a square and cube of a number.
	
	/**
	 * This method will calculate square of given number
	 * @param num
	 * @return square
	 */
	public int calculateSquare(int num) {
		int square = num*num;
		return square;
	}
	
	/**
	 * This method will calculate cube of given number
	 * @param num
	 * @return cube
	 */
	public int calculateCube(int num) {
		return num*num*num;
	}

	public static void main(String[] args) {
		//taking inputs from user
		int num;				
		Scanner sc = new Scanner(System.in);		
		System.out.println("enter a number: ");	
		num = sc.nextInt();
		
		//create object of SquareAndCubeMethods class
		SquareAndCubeMethods sq = new SquareAndCubeMethods();
		
		//invoke method to calculate square
		int square = sq.calculateSquare(num);
		
		System.out.println("square of "+ num + " is = "+ square);
		
		//invoke method to calculate cube
		int cube = sq.calculateCube(num);
		
		System.out.println("Cube of "+ num + " is = "+ cube);		

	}

}
