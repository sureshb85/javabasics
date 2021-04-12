package javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// A map is a key and value pair. 
// Each key and value pair is known as an entry.
// A Map contains unique keys
// A Map values can be duplicate
// A null key & null value is allowed
// not synchronized
// maintains insertion order

public class LinkedMapexample {
	public static void main(String[] args) {
		Map<String, String> fruitsMap = new LinkedHashMap<String, String>();
		// Adding elements to map
		fruitsMap.put("A", "Apple");
		fruitsMap.put("B", "Mango");
		fruitsMap.put("C", "Orange");
		fruitsMap.put("D", "Peach");
		System.out.println("size of fruitsMap " + fruitsMap.size());
		System.out.println("isEmpty:fruitsMap " + fruitsMap.isEmpty());
		// using keySet
		Set<String> names = fruitsMap.keySet();
		for (String name : names) {
			System.out.println("Key: " + name + ", Fruit: " + fruitsMap.get(name));
		}

		// using entrySet
		for (Map.Entry<String, String> pair :  fruitsMap.entrySet()) {
			System.out.println("Key: " + pair.getKey() + ", Fruit: " + pair.getValue());
		}
		Map<String, Map<String, Object>> partyCelebrations = new HashMap<>();

		Map<String, Object> snacks = new HashMap<>();
		snacks.put("Biscuits", 2500);
		snacks.put("Cake", "10Kg Vanilla");
		snacks.put("Water", "10Ltrs");

		partyCelebrations.put("Birthday", snacks);

		snacks = new HashMap<>();
		snacks.put("Biscuits", 5000);
		snacks.put("Cake", "100Kg Vanilla");
		snacks.put("Thumbs Up", "100Ltrs");
		partyCelebrations.put("Marriage", snacks);

		Map<String, Object> birthday = partyCelebrations.get("Birthday");
		int biscuit = (Integer) birthday.get("Biscuits");
		System.out.println("Biscuits: " + biscuit);
		
		// remove
		// containsKey
		// containsValue
		// get(Key)
		// putAll
		// clear
		// putIfAbsent
		// getOrDefault
		
	}
}
