package co.grandcircus.fbjava_july2018.exercise_01;

import java.util.Scanner;

/*
 * Exercise 01
 * Prompt the user to enter a string. After the user enters a string, output the same string back to the console.
 * 
 * EXAMPLE
 * Enter some text: <<Hello, World! ECHOOOOOO!
 * Hello, World! ECHOOOOOO!
 */

/*
 * Java provides a number of access modifiers to set access levels for classes, variables, methods, and constructors.
 * The four are: Default, Public, Private, and Protected.
 */

public class HelloEcho {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String usrInput = null;

		System.out.printf("Enter a short sentence. :");
		usrInput = scnr.nextLine();

		System.out.printf("You've entered :\"" + usrInput + "\"");

		scnr.close();

	}
}
