package javacollections;

import java.util.Map;
import java.util.TreeMap;

// A map is a key and value pair. 
// Each key and value pair is known as an entry.
// A Map contains unique keys
// A Map values can be duplicate
// A null key & null value is not allowed
// not synchronized
// default ascending order 
public class TreeMapexample {
	public static void main(String[] args) {
		TreeMap<String, String> fruitsMap = new TreeMap<String, String>();
		// Adding elements to map
		fruitsMap.put("A", "Apple");
		fruitsMap.put("B", "Mango");
		fruitsMap.put("C", "Orange");
		fruitsMap.put("D", "Peach");
		System.out.println("default order: " + fruitsMap);
		System.out.println("descendingMap: " + fruitsMap.descendingMap());
		
		// less then the specified key in headMap() pairs are retrieved
		System.out.println("headMap: " + fruitsMap.headMap("B", true));
		// greater then the specified key in headMap() pairs are retrieved
		System.out.println("tailMap: " + fruitsMap.tailMap("C", true));
		// all key-value pairs present between the specified keys.
		System.out.println("subMap: " + fruitsMap.subMap("B", true, "D", true));
	}
}
