package com.vm.daysofcode;

import java.util.Arrays;
import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {

	private int[] testScores;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	public Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		testScores = scores;
		// TODO Auto-generated constructor stub
	}

	// Write your constructor here

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	public char calculate() {
		double total = 0;
		
		for (int i = 0; i < testScores.length; i++) {
			total += testScores[i];
		}
		double average = total / testScores.length;
		if (average < 40)
			return 'T';
		else if (average >= 40 && average < 55)
			return 'D';
		else if (average >= 55 && average < 70)
			return 'P';
		else if (average >= 70 && average < 80)
			return 'A';
		else if (average >= 80 && average < 90)
			return 'E';
		else
			return 'O';

	}
	// Write your method here
}

public class Inheritance {

	public Inheritance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}
