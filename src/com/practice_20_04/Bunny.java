package com.practice_20_04;

import java.util.Scanner;

public class Bunny {

	    public static final int sum=1;
	    public static final int Sub=2;
	    public static final int Multiply=3;
	    public static final int division=4;
	    		

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
	    
		int opreation;
	    System.out.println("enter the opration number which you want perform [(addition=1, substraction=2, multiplication=3, division=4]=");
	    opreation=sc.nextInt();
	    
	    if(opreation>4)
		{
	    	
	    	System.out.println("please enter correct Opreation number");
		}
	    else
	    {
	    int num1;
	    int num2;
		System.out.println("Enter your first no=");
		num1=sc.nextInt();
		System.out.println("Enter your Second no=");
		num2=sc.nextInt();
		
		switch (opreation)
		{
		case sum:
			{
		     int sum=num1+num2;
		     System.out.println("Addition="+sum);
		     break;
			}
		case Sub:
		{
	     int sub=num1-num2;
	     System.out.println("Substraction="+sub);
	     break;
		}
		case Multiply:
		{
	     int Multiply=num1*num2;
	     System.out.println("Multiplication="+Multiply);
	     break;
		}	
		case division:
		{
	     float divisionf=num1/num2;
	     System.out.println("Division="+divisionf);
	     break;
		}
		default:
			System.out.println("no defined operation, please enter correct number");
				
		break;
		}
	}
	
	}
}
