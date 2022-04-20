package com.practice_20_04;

import java.util.Scanner;

public class AreaAndPerimeter {
	//Write a program and create method to find out area and perimeter of Rectangle.
	
	/**
	 * This method will calculate area of rectangle
	 * @param length
	 * @param breadth
	 * @return area
	 */
	public double calculateAreaOfRectangle(double length, double width) {
		return length*width;
	}
	
	/**
	 * This method will calculate perimeter of rectangle
	 * @param length
	 * @param width
	 * @return perimeter
	 */
	public double calculatePerimeter(double length, double width) {
		return 2*(length+width);
		
	}
	

	public static void main(String[] args) {
		// take inputs from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter length of rectangle:");
		double length = sc.nextDouble();
		System.out.println("enter width of rectangle: ");
		double width = sc.nextDouble();
		
		//create AreaAndPerimeter class object
		AreaAndPerimeter ap = new AreaAndPerimeter();
		
		//invoke calculateAreaOfRectangle() to calculate area
		double area = ap.calculateAreaOfRectangle(length, width);
		System.out.println("area of rectangle: " + area);
		
		
		//invoke calculatePerimeter() to calculate area
		double perimeter = ap.calculatePerimeter(length, width);
		System.out.println("perimeter of rectangle: " + perimeter);
	

	}

}
