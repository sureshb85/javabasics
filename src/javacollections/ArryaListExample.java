package javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// allows duplicates
// allows null values
// maintains insertion order
// not synchronized - faster to retrieve/manipulate

public class ArryaListExample {
	public static void main(String args[]) {
		ArrayList<String> fruitsList = new ArrayList<String>();
		fruitsList.add("Apple");
		fruitsList.add("Orange");
		fruitsList.add("Mango");
		fruitsList.add("Peach");
		fruitsList.add("Apple");
		fruitsList.add(null);
		
		fruitsList.add(0, "Watermelon");
		fruitsList.add("Mango");
		System.out.println("size of ArrayList " + fruitsList.size());
		
		
		// Using Iterator to traverse the frutisList
		Iterator<String> itrator = fruitsList.iterator();
		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}
		System.out.println("=========================================");
		// traditional loop
		for (int i = 0; i < fruitsList.size(); i++) {
			System.out.println(fruitsList.get(i));

		}System.out.println("=========================================");
		// using for loop
		for (String fruit : fruitsList) {
			System.out.println(fruit);
		}System.out.println("=========================================");

		//forEach
		fruitsList.forEach(System.out::println);
		System.out.println("=========================================");
		// ListIterator provides more methods/functioanlity then iterator
		ListIterator<String> listIterator = fruitsList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(
					listIterator.next());
		}
		System.out.println("=========================================");
		// Search item
		boolean containsFruit = fruitsList.contains("Mango");
		System.out.println("Mango in fruitsList using contains\t -> " + containsFruit);
		containsFruit = fruitsList.contains("Raw Mango");
		System.out.println("Raw Mango in fruitsList using contains\t -> " + containsFruit);
		
		
		int firstIndex = fruitsList.indexOf("Mango");
		
		int lastIndex = fruitsList.lastIndexOf("Mango");
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
		//fruitsList.add(null);

		// remove object
		fruitsList.remove(null);
		System.out.println("remove null" + fruitsList);
		
		// remove object
		fruitsList.remove("apple");
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
