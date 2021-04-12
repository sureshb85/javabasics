package javacollections;

import java.util.HashSet;
import java.util.Iterator;

//no duplicates - only unique values
//allows null values
//no insertion order

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> fruitsSet = new HashSet<String>();
		fruitsSet.add("Apple");
		fruitsSet.add("Orange");
		fruitsSet.add("Mango");
		fruitsSet.add("Peach");
		fruitsSet.add("Apple");
		fruitsSet.add("Orange");
		fruitsSet.add("Mango");
		fruitsSet.add("Peach");
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
