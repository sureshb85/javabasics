package javabasics;

public class ArrayPrograms {

	public static void main(String[] args) {

		String[] names = { "Apple", "Boy", "Cat", "Dog" };
		System.out.println("Total array values: " + names.length);

		for (int i = 0; i < names.length; i++) {
			System.out.println(i + " -- " + names[i]);
		}

		// reverse the items in array
		System.out.println("=====================Reverse Array==========================");
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println(i + " -- " + names[i]);
		}
		
		int total = 0;
		
		// sum of array values
		System.out.println("=====================Sum Array values==========================");
		int[] numbers = { 1, 3, 1 ,4, 2 };
		for (int i = 0; i <= names.length; i++) {
			total += numbers[i];
			System.out.println(i + " -- " + numbers[i] + " -- " + total);
		}
		System.out.println("Sum of array values: " + total);
		
		// average of array values
		// largest value in array
		// smallest value in array
	}

}
