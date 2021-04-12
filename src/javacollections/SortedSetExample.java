package javacollections;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> integerSet = new TreeSet<Integer>();
		integerSet.add(3);
		integerSet.add(5);
		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(4);
		integerSet.add(3);
		integerSet.add(5);
		integerSet.add(4);
		integerSet.add(0);
		integerSet.add(89);

		integerSet.add(1);
		integerSet.add(2);

		System.out.println("size of v " + integerSet.size());
		// using iterator
		Iterator<Integer> iterator = integerSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Iterator<Integer> descIterator = integerSet.descendingIterator();
		while (descIterator.hasNext()) {
			System.out.println(descIterator.next());
		}

		System.out.println("First Value: " + integerSet.pollFirst());
		System.out.println("Last Value: " + integerSet.pollLast());
		TreeSet<String> cars = new TreeSet<String>();
		cars.add("Ford");
		cars.add("Audi");
		cars.add("Alto");
		cars.add("BMW");
		System.out.println("First Value: " + cars.pollFirst());
		System.out.println("Last Value: " + cars.pollLast());

	}
}
