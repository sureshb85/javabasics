package javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

//no duplicates - only unique values
//allows null values
//maintains insertion order

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> fruitsSet = new LinkedHashSet<String>();
		fruitsSet.add("Apple");
		fruitsSet.add("Orange");
		fruitsSet.add("Mango");
		fruitsSet.add("Peach");
		fruitsSet.add("Apple");
		System.out.println("size of fruitsSet " + fruitsSet.size());
		Iterator<String> iterator = fruitsSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		fruitsSet.clear();
		System.out.println("isEmpty " + fruitsSet.isEmpty());
		System.out.println(fruitsSet);

		fruitsSet.add("Apple");
		fruitsSet.add("Orange");
		fruitsSet.add("Mango");
		fruitsSet.add("Peach");
		fruitsSet.add("Apple");
		System.out.println("isEmpty " + fruitsSet.isEmpty());
	}
}
