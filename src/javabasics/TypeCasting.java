package javabasics;

/*
 * Type casting is when you assign a value of one primitive data type to another type.
 * In Java, there are two types of casting:
 * Widening Casting (automatically) - converting a smaller type to a larger type size 
	byte -> short -> char -> int -> long -> float -> double
 * Narrowing Casting (manually) - converting a larger type to a smaller size type
	double -> float -> long -> int -> char -> short -> byte
 *
 */
public class TypeCasting {

	public static void main(String[] args) {
		widening();
		narrowing();
	}

	private static void narrowing() {
		double myDouble = 9.78;
		int myInt = (int) myDouble; // Narrow Casting from double to int is performed manually
		System.out.println("========================Narrow Cast================================================");
		System.out.println("myInt: " + myInt);  
		System.out.println("myDouble: " + myDouble);
		System.out.println("========================Narrow Cast================================================");
	}

	private static void widening() {
		int myInt = 9;
		double myDouble = myInt; // Widening Casting from int to double is performed automatically
		System.out.println("========================Widening Cast================================================");
		System.out.println("myInt: " + myInt);  
		System.out.println("myDouble: " + myDouble);
		System.out.println("========================Widening Cast================================================");
		
	}
}
