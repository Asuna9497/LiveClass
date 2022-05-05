package com.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileHandaling {

	private static final int read = 1;
	private static final int write = 2;
	private static final int append = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which file operation you want to perform? (entre 1 to read, 2 to write, 3 to append) ");
		int opr = sc.nextInt();

		switch (opr) {
		case read: {
			String path = getFilePath(sc);
			readExistingFile(path);
			break;
		}
		case write: {
			String path = getFilePath(sc);
			CreateAndWriteInFile(path, sc);
			break;
		}
		case append: {
			String path = getFilePath(sc);
			appendDataInExistingFile(path, sc);
			break;
		}
		default:
			System.out.println("Enter correct operation number to continue");
		}

	}

	private static void appendDataInExistingFile(String path, Scanner sc) {
		String content = getContentFromUser(sc);
		Path filePath = Paths.get(path);
		
		try {
			Files.write(filePath, content.getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			System.out.println("content appended successfully");

		} catch (IOException e) {
			System.out.println("failed to append content");
			e.printStackTrace();
		}
	}

	private static void CreateAndWriteInFile(String fileName, Scanner sc) {
		String content = getContentFromUser(sc);
		Path filePath = Paths.get(fileName);
		
		try {
			Files.write(filePath, content.getBytes());
			System.out.println("content written successfully");

		} catch (IOException e) {
			System.out.println("failed to write content");
			e.printStackTrace();
		}
	}
	
	private static void readExistingFile(String path) {
		File file = new File(path);	
		try {
			FileReader fr =  new FileReader(file);
			BufferedReader reader =
			        new BufferedReader(fr);
			reader.lines().forEach(System.out::println);
			System.out.println("content read successfully");
			reader.close();
		} catch (IOException e) {
			System.out.println("Failed to read a file");
			e.printStackTrace();
		}
		
	}

	private static String getFilePath(Scanner sc) {
		System.out.println("Enter file path");
		return sc.next();
	}

	private static String getContentFromUser(Scanner sc) {
		String result = "";
		
		System.out.println("how many words you want to write in file: ");
		int length = sc.nextInt();
		
		System.out.println("Enter the content you want to write in file: ");

		// make array of string with user input
		String[] string = new String[length];
		// consuming the <enter> from input above
		sc.nextLine();
		for (int i = 0; i < string.length; i++) {
			string[i] = sc.nextLine();
		}
		// for-each loop to print the string
		for (String str : string) {
			result = result+" "+str;
		}

		return result;
	}
}
