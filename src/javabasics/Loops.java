package javabasics;

/*
 * 
 * Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly 
 * while some condition evaluates to true.
 * 
 * while: The while statement continually executes a block of statements while a particular condition is true. (Entry control loop)
 * 
 * do-while:  do while loop is similar to while loop with only difference that it checks for condition after executing the statements (Exit Control Loop)
 * 
 * for: for loop provides a concise way of writing the loop structure. Unlike a while loop, a for statement consumes the initialization, 
 * condition and increment/decrement in one line thereby providing a shorter, easy to debug structure of looping.
 */
public class Loops {
	public static void main(String[] args) {
		int count = 1;
		while (count < 11) {
			System.out.println("Count is: " + count);
			count++;
		}

		int value = 1;
		do {
			System.out.println("Value is: " + value);
			value++;
		} while (value < 11);
		for (int i = 1; i < 11; i++) {
			System.out.println("Count is: " + i);
		}
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int number : numbers) {
			System.out.println("Count is: " + number);
		}
	}
}
