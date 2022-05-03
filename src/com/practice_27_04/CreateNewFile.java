package com.practice_27_04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		try {
			createFileUsingFileClass();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void createFileUsingFileClass() throws IOException {

		File file = new File("C:\\FSD course\\fileTopicsPractice\\file1.txt");

		if (file.createNewFile()) {
			System.out.println("File created successfully");

		} else {
			System.out.println("File is already exist");
		}

		FileWriter writer = new FileWriter(file);
		writer.write("Hello everyone welcome to file handling");
		System.out.println("Data written successfully");
		writer.close();

	}
	

}
