package javacollections;

import java.util.Arrays;
import java.util.List;

public class ArraysClassExample {
	public static void main(String[] args) {
		// Get the Array
		int integerArray[] = { 14, 28, 15, 22, 35, 45, 2, 88 };
		Arrays.sort(integerArray);
		int intKey = 22;
		int binSearch = Arrays.binarySearch(integerArray, intKey);
		System.out.println(intKey + " located at index = " + binSearch);

		Arrays.sort(integerArray);

		// Arrays to List
		List<int[]> listInetgers = Arrays.asList(integerArray);

		// copy
		int[] copyArray = Arrays.copyOf(integerArray, 8);
		System.out.println(Arrays.toString(copyArray));

		// Arrays.copyOfRange(listInetgers, 1, 3)

		// Arrays.equals(listInetgers1, listInetgers2)
	}
}
