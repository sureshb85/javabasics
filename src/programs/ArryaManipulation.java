package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArryaManipulation {
	public int size, index;
	public int arr[];

	public String getPriceDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  of elements in the array");
		try {
			size = sc.nextInt();
			arr = new int[size];
			System.out.println("Enter the price details");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			index = sc.nextInt();
			sc.close();
			return ("The array element is " + arr[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			return ("Array index is out of range");
		} catch (InputMismatchException e) {
			return ("Input was not in the correct format");
		}
	}

	public static void main(String args[]) {
		ArryaManipulation ex = new ArryaManipulation();
		System.out.println(ex.getPriceDetails());
	}
}