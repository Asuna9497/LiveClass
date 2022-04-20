package com.practice_20_04;

public class Employee {

	// Write program to create a class Employee where employee has empCode(int),
	// empName(String),
	// empEmail(String)
	int empCode;
	String empName;
	String empEmail;

	// create parameterized constructor to initialize the values
	public Employee(int code, String name, String email) {
		empCode = code;
		empName = name;
		empEmail = email;
	}

	/**
	 * This method will display the attribute's values of employee
	 * 
	 * @param employee
	 */
	public void display(Employee employee) {
		System.out.println("employee code: " + employee.empCode);
		System.out.println("employee name: " + employee.empName);
		System.out.println("employee email: " + employee.empEmail +"\n");
	}

	public static void main(String[] args) {

		// create 3 objects from main method and pass parameters in your constructor
		Employee d1 = new Employee(101, "Asuna", "Asuna@practice.com");

		Employee d2 = new Employee(102, "Bunny", "Bunny@practice.com");

		Employee d3 = new Employee(103, "Nazuko", "Nazuko@practice.com");

		// call display method to print employee
		System.out.println("1. print first employee \n");
		d1.display(d1);

		System.out.println("2. print second employee \n");
		d2.display(d2);

		System.out.println("3. print third employee \n");
		d3.display(d3);

	}

}
