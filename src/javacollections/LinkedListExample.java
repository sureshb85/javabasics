package javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// allows duplicates
// allows null values
// maintains insertion order
// not synchronized

public class LinkedListExample {
	public static void main(String args[]) {
		LinkedList<String> fruitsList = new LinkedList<String>();
		fruitsList.add("Apple");
		fruitsList.add("Orange");
		fruitsList.add("Mango");
		fruitsList.add("Peach");
		fruitsList.add("Apple");

		System.out.println("size of ArrayList " + fruitsList.size());
		// Using Iterator to traverse the frutisList
		Iterator<String> itrator = fruitsList.iterator();
		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}

		// traditional loop
		for (int i = 0; i < fruitsList.size(); i++) {
			System.out.println(fruitsList.get(i));

		}
		// using for loop
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}

		fruitsList.forEach(System.out::println);

		// ListIterator provides more methods/functioanlity then iterator
		ListIterator<String> listIterator = fruitsList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Search item
		boolean containsFruit = fruitsList.contains("Mango");
		int firstIndex = fruitsList.indexOf("Mango");
		int lastIndex = fruitsList.lastIndexOf("Mango");
		System.out.println("contains " + containsFruit);
		System.out.println("firstIndex " + firstIndex);
		System.out.println("lastIndex " + lastIndex);
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}

		// add element at last
		fruitsList.add("Guava");
		System.out.println(fruitsList);
		// add element at index using set
		fruitsList.set(0, "Cherry");
		System.out.println(fruitsList);
		// add element at index using add
		fruitsList.add(0, "Banana");
		System.out.println(fruitsList);
		// add null
		fruitsList.add(null);
		fruitsList.push("Carrot");

		// remove object
		fruitsList.remove(null);
		System.out.println(fruitsList);

		ArrayList<String> fruitsList2 = new ArrayList<String>();
		fruitsList2.add("Grapes");
		fruitsList2.add("Orange");
		fruitsList2.add("Mango");
		fruitsList2.add("Strawberry");

		// operations
		fruitsList.removeAll(fruitsList2);
		System.out.println(fruitsList);

		fruitsList.addAll(fruitsList2);
		System.out.println(fruitsList);

		fruitsList.retainAll(fruitsList2);
		System.out.println(fruitsList);
	}
}
