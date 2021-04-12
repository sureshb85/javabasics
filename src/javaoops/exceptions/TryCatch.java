package javaoops.exceptions;

import java.util.InputMismatchException;

public class TryCatch {

	/*
	 * The first step in constructing an exception handler is to enclose the code
	 * that might throw an exception within a try block. In general, a try block
	 * looks like the following:
	 * 
	 * try { code }
	 * 
	 * catch and finally blocks
	 */

	// No code can be between the end of the try block and the beginning of the
	// first catch block.

	// Each catch block is an exception handler that handles the type of exception
	// indicated by its argument.

	/*
	 * try {
	 * 
	 * } catch (ExceptionType name) {
	 * 
	 * } catch (ExceptionType name) {
	 * 
	 * }
	 */
	public static void main(String args[]) {
		try {
			// code that throws an exception within a try block
			System.out.println("Divison");
			int data = 100 / 2;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// remaining code
		System.out.println("remaining code...");

		int a[] = { 1, 3, 45 };
		try {
			int divide = a[4] / 0;
			System.out.println("Division by zero " + divide);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: --> " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: --> " + e);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: --> " + e);
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}

		// nested try block

	}
}