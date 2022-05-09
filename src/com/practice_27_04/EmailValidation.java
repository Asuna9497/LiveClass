package com.practice_27_04;

//package com.practice_27_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {
	
	public static String Check(String email_id)
	{
		String result = null;
		String[] email = { "john12@gmail.com", "peter@yahoo.com", "robert35@rediff.com", "surya108@orkut.com",
				"george356@hello.com" };
		for (int i = 0; i < email.length; i++) {
			if (email_id.equals(email[i])) {
				result = "Valid";
				break;
			} else {
				result = "Invalid";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String a=null;
		//boolean b = false;
		String pattern = "[a-zA-Z0-9]+"+"@"+"[a-zA-Z0-9]+"+"."+"[a-z]{3}";
		
		String[] email = {"john12@gmail.com","peter@yahoo.com","robert35@rediff.com","surya108@orkut.com","george356@hello.com"};
		
		Pattern p = Pattern.compile(pattern);
		
		for (int i=0;i<email.length;i++)
		{
			Matcher m = p.matcher(email[i]);
			boolean b = m.matches();
			System.out.println(b);
		}
		
		Scanner sc = new Scanner(System.in);
		
	//EmailValidation obj = new EmailValidation();
	System.out.println("Please enter your email id: ");
	a=sc.next();
	String output = EmailValidation.Check(a);
	System.out.println("Entered Email is " + output);

		
		
		
		
		
		
		
		
		
		
	}

	
	
}
