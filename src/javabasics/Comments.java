package javabasics;



// single line comment
/*
 * Multiline comment
 */

/*
 * In Java there are three types of comments:
 * Single – line comments: A beginner level programmer uses mostly single-line comments for describing the code functionality. Its the most easiest typed comments.
 * Multi – line comments: To describe a full method in a code or a complex snippet single line comments can be tedious to write, since we have to give ‘//’ at every line. So to overcome this multi line comments can be used.
 * Documentation comments: This type of comments are used generally when writing code for a project/software package, 
 * since it helps to generate a documentation page for reference, which can be used for getting information about methods present, its parameters, etc.
 * 
 */

/**
 * <h1>Addition of 2 numbers</h1> The Addition program adds two numbers first
 * and second Prints the output on the screen.
 *
 * @author Java Basics
 * @version 1.0
 * @since 2021-04-05
 */
public class Comments {
	/**
	 * This method is used to add two integers.
	 * 
	 * @param firstNumber  This is the first parameter to addNumbers method
	 * @param secondNumber This is the second parameter to addNumbers method
	 * @return int returns the sum of both the numbers.
	 */
	public int addNumbers(int firstNumber, int secondNumber) {
		return (firstNumber + secondNumber);
	}

	/**
	 * This is the main method invokes the addNumbers method.
	 * 
	 * @param args Unused.
	 * @return Nothing.
	 */

	public static void main(String args[]) {
		Comments addObject = new Comments();
		int sum = addObject.addNumbers(150, 142);

		System.out.println("Addition of 150 & 142 is :" + sum);
	}
}