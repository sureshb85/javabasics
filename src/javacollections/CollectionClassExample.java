package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// is used exclusively with static methods that operate on or return collections.
public class CollectionClassExample {
	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(46);
		listOfIntegers.add(67);
		listOfIntegers.add(24);
		listOfIntegers.add(16);
		listOfIntegers.add(8);
		listOfIntegers.add(12);
		System.out.println("Max value: " + Collections.max(listOfIntegers));
		System.out.println("Min value: " + Collections.min(listOfIntegers));
		Collections.addAll(listOfIntegers, 999, -123);
		System.out.println("Max value: " + Collections.max(listOfIntegers));
		System.out.println("Min value: " + Collections.min(listOfIntegers));
		Collections.sort(listOfIntegers);  
		System.out.println("Sorting: " + listOfIntegers);
		Collections.sort(listOfIntegers,Collections.reverseOrder());  
		System.out.println("Reverse Sorting: " + listOfIntegers);
	}
}
