package javabasics;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		
		int[] intDefaultArrayValues = {1,2,3,4,5,6,7,8,9,0};
		for (int i = 0; i < intDefaultArrayValues.length; i++)
			System.out.println("default intArray value at index " + i + " is: " + intDefaultArrayValues[i]);

		float[] floatArray = new float[5];
		floatArray[0] = 10.50f;
		floatArray[1] = 20.50f;
		floatArray[2] = 30.50f;
		floatArray[3] = 40.50f;
		floatArray[4] = 50.50f;

		double[] doubleArray = new double[5];
		doubleArray[0] = 10.50f;
		doubleArray[1] = 20.50f;
		doubleArray[2] = 30.50f;
		doubleArray[3] = 40.50f;
		doubleArray[4] = 50.50f;

		System.out.println("intArray at index 0 is: " + intArray[0]);
		System.out.println("floatArray at index 0 is: " + floatArray[0]);
		System.out.println("doubleArray at index 0 is: " + doubleArray[0]);

		for (int i = 0; i < intArray.length; i++)
			System.out.println("intArray value at index " + i + " is: " + intArray[i]);

		for (int i = 0; i < floatArray.length; i++)
			System.out.println("floatArray value at index " + i + " is: " + floatArray[i]);

		for (int i = 0; i < doubleArray.length; i++)
			System.out.println("doubleArray value at index " + i + " is: " + doubleArray[i]);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a five valid integer\r");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < intArray.length; i++)
			System.out.println("intArray value at index " + i + " is: " + intArray[i]);

	}
}
