package javabasics;

/*
 * An expression is a construct made up of variables, operators, and method invocations, 
 * which are constructed according to the syntax of the language, that evaluates to a single value.
 */
public class Expressions {
	public static void main(String[] args) {
		int cadence = 0;
		System.out.println(cadence);
		int anArray[] = new int[2];
		anArray[0] = 100;
		System.out.println("Element 1 at index 0: " + anArray[0]);

		int result = 1 + 2; // result is now 3
		System.out.println(result);
		int value1 = 1;
		int value2 = 1;
		if (value1 == value2)
			System.out.println("value1 == value2");
	}
}

// A block is a group of zero or more statements between balanced braces and can be used anywhere a single statement is allowed.
/*
 * boolean condition = true; 
 * if (condition) { // begin block 1
 *	System.out.println("Condition is true."); 
 *} // end block one
 * else { // begin block 2 
 * System.out.println("Condition is false."); 
 * } // end block 2
 */