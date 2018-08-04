package co.grandcircus.exercise_01;

import java.util.Scanner;

/*
 * Exercise 01
 * Prompt the user to enter a string. After the user enters a string, output the same string back to the console.
 * 
 * EXAMPLE
 * Enter some text: <<Hello, World! ECHOOOOOO!
 * Hello, World! ECHOOOOOO!
 */

public class HelloEchoApp {

	/*
	 * Java provides a number of access modifiers to set access levels for classes,
	 * variables, methods, and constructors. The four are: Default, Public, Private,
	 * and Protected.
	 */

	public static void main(String[] args) {

		// Create scanner object.
		Scanner scnr = new Scanner(System.in);
		// Declaring a variable. String is non-primitive, an object reference. Class.
		String usrInput;

		// Prompt user for the first date to compare.
		System.out.println("Enter a short sentence. :");
		usrInput = scnr.nextLine();

		System.out.println("You've entered :\"" + usrInput + "\"");

		scnr.close(); // Stops Eclipse' "Resource leak" warning when using scanner.

	}
}
