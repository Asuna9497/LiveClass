package com.project;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	private static String VALID_EMAIL = " found and valid.";
	private static String INVALID_EMAIL = "not found.";

	private static String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// take input for size of mail array
		System.out.println("How many email Ids you want to enter/store ?");
		int arrayLength = sc.nextInt();

		if (arrayLength > 0) {
			// show samples
			showSampleMails();

			// create array of valid mails
			String[] mailArray = createEmailIdArray(arrayLength, sc);

			// search mail entered by user in mail array
			if (null != mailArray) {

				System.out.println("Enter email id you want to validate: ");
				String mailToBeValidated = sc.next();

				String isValid = verifyEmailIds(mailArray, mailToBeValidated);

				System.out.println("Entered email id " + mailToBeValidated + " is " + isValid);
			} else {
				System.out.println("re-run the program");
			}
		} else {
			System.out.println("Please enter the valid count and re-run the program");
		}

	}

	/**
	 * This method validates entered email id
	 * 
	 * @param mailArray
	 * @param mailToBeValidated
	 * @return result
	 */
	private static String verifyEmailIds(String[] mailArray, String mailToBeValidated) {
		String result = INVALID_EMAIL;

		for (String mail : mailArray) {

			if (mail.equals(mailToBeValidated)) {
				result = VALID_EMAIL;
				break;
			}
		}
		return result;
	}

	/**
	 * This method will validate the email based on regex to restrict leading,
	 * trailing, or consecutive dots in mails i.e Both the local part and the domain
	 * name can contain one or more dots, but no two dots can appear right next to
	 * each other. Furthermore, the first and last characters in the local part and
	 * in the domain name must not be dots
	 * 
	 * @param mail
	 * @param mailToBeValidated
	 * @return
	 */
	private static boolean validateEmailPattern(String mail) {
		Pattern mailPattern = Pattern.compile(regex);
		Matcher matcher = mailPattern.matcher(mail);
		return matcher.matches();
	}

	/**
	 * This method return array of email Ids
	 * 
	 * @param arrayLength
	 * @param sc
	 * @return array
	 */
	private static String[] createEmailIdArray(int arrayLength, Scanner sc) {
		String[] array = new String[arrayLength];
		int index = 0;

		while (index == 0 || index < arrayLength) {
			System.out.println("Enter an email Id:");
			String str = sc.next();
			if (validateEmailPattern(str)) {
				array[index] = str;
				index++;
			} else {
				System.out.println("You have entered wrong email pattern. Please enter correct email: ");
			}

		}

		return array;
	}

	/**
	 * This method will show samples of mails supposed to be entered by user
	 */
	private static void showSampleMails() {
		System.out.println("Below are the sample mail patterns you can enter: " + "\n user@domain.com \n "
				+ "user@domain.co.in  \n " + "user.name@domain.com \n " + "user'name@domain.co.in");

	}

}
