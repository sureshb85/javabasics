package javabasics;

/* What is a variable ?
 * A variable is a name given to memory allocation. It's like a storage unit in a program.
 * Example: Sugar stored in a box/container.
 * Box/container is variable which placed in a kitchen
 * Sugar is a item stored in the box.
 * Sugar quantity can change based on the usage
 * 
 * The value stored in a variable can be modified during program execution.
 * All the modification performed on the variable effects the assigned memory allocation
 * The variable must be declared with proper data type before using. 
 * 
 * 
 * Variable can be created as below
 * DataType
 * Name
 * Value
 * 
 * Variables Naming convention: 
 * are case sensitive
 * always starts with a letter
 * Subsequent characters may be letters, digits, dollar signs, or underscore characters. 
 * 	Conventions (and common sense) apply to this rule as well. When choosing a name for your variables,
 * 
 * If the name you choose consists of only one word, spell that word in all lowercase letters.
 * If it consists of more than one word, capitalize the first letter of each subsequent word. The names gearRatio and currentGear are prime examples of this convention. 
 * 
 * If your variable stores a constant value, such as static final int NUM_GEARS = 6, the convention changes slightly, 
 * capitalizing every letter and separating subsequent words with the underscore character. 
 */

//primitive data types
/* byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive)
 * short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)
 * int: The int data type is a 32-bit signed two's complement integer, which has a minimum value of -2 power of 31 and a maximum value of 2 power of 31-1.
 * long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -2 power of 63 and a maximum value of 2 power of 63-1
 * float: The float data type is a single-precision 32-bit IEEE 754 floating point. 
 * double: The double data type is a double-precision 64-bit IEEE 754 floating point.
 * boolean: The boolean data type has only two possible values: true and false.
 * char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 */



//https://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3

/* Types of Variables
 * There are three types of variables in Java:
 * 
 * local variable: A variable declared inside the body of the method is called local variable. 
 * You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
 * A local variable cannot be defined with "static" keyword.
 * 
 * instance variable: A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.
 * It is called instance variable because its value is instance specific and is not shared among instances.
 * 
 * static variable: A variable which is declared as static is called static variable. It cannot be local. 
 * You can create a single copy of static variable and share among all the instances of the class.
 * Memory allocation for static variable happens only once when the class is loaded in the memory.
 */


public class Variables {
	
	int firstNumber = 50; // instance variable
	static int secondNumber = 100; // static variable
	int thirdNumber;
	
	public static void main(String[] args) {
		
		int thirdNumber = 150; //local variable
		System.out.println("Local variable: " + thirdNumber);
		
		byte b = 127; //between -128 to 127 values
		short s = 32767; // from -32768 to 32767
		int i = 2147483647;
		long l = 100000L; //-9,223,372,036,854,775,808  to 9,223,372,036,854,775,807
		float f = 234.5f; //value range is unlimited
		double d = 12.3d; //d or D is optional and value range is unlimited - both float & double are not suggested for large decimal numbers instead use BigDecimals
		char c = 'C'; // a single character
		char cc = '\u0391'; 
		String str = "Learning Java"; // sequence of characters alpha numerical values
		boolean isHappy = true; // only true or false
		
		if(isHappy) {
			System.out.println("I am Happy");
		} else {
			System.out.println("I am Hungry");
		}
		
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c);
		System.out.println("unicode char: " + cc);
		System.out.println("String: " + str);
		System.out.println("Boolean: " + isHappy);
	
		// 32 bits
		int intMinValue = Integer.MIN_VALUE;
		int intMaxValue = Integer.MAX_VALUE;
		System.out.println("Int Minimum value: " + intMinValue);
		System.out.println("Int Maximum value: " + intMaxValue);
		
		// 16 bits
		byte byteMinValue = Byte.MIN_VALUE;
		byte byteMaxValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum value: " + byteMinValue);
		System.out.println("Byte Maximum value: " + byteMaxValue);
		
		// 8 bits
		short shortMinValue = Short.MIN_VALUE; 
		short shortMaxValue = Short.MAX_VALUE;
		System.out.println("Short Minimum value: " + shortMinValue);
		System.out.println("Short Maximum value: " + shortMaxValue);
		
		// 8 bits
		long longMinValue = Long.MIN_VALUE; 
		long longMaxValue = Long.MAX_VALUE;
		System.out.println("Long Minimum value: " + longMinValue);
		System.out.println("Long Maximum value: " + longMaxValue);
		
		
	}

}

/*
Data Type	Default Value (for fields)
byte		0
short		0
int			0
long		0L
float		0.0f
double		0.0d
char		'\u0000'
String (or any object)  	null
boolean		false
*/
