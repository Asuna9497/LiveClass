package com.practice_19_04;

public class FirstFiftyEvenNum {

	public static void main(String[] args) {
		// Write a program to print first 50 even numbers using for loop.
		
		for(int i =1; i<=50; i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				continue;
			}
			
		}
		

	}

}
