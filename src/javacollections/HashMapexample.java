package javacollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// A map is a key and value pair. 
// Each key and value pair is known as an entry.
// A Map contains unique keys
// A Map values can be duplicate
// A null key & null value is allowed
// not synchronized
// no insertion order 
public class HashMapexample {
	public static void main(String[] args) {
		Map<String, String> fruitsMap = new HashMap<String, String>();
		// Adding elements to map
		fruitsMap.put("A", "Apple");
		fruitsMap.put("M", "Mango");
		fruitsMap.put("O", "Orange");
		fruitsMap.put("P", "Peach");
			
		System.out.println("size of fruitsMap " + fruitsMap.size());
		System.out.println("isEmpty:fruitsMap " + fruitsMap.isEmpty());
		// using keySet
		Set<String> names = fruitsMap.keySet();
		System.out.println(names + "only keys");
		
		Collection<String> values = fruitsMap.values();
		System.out.println(values + "only values");
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
		snacks.put("Water", "100Ltrs");
		partyCelebrations.put("Marriage", snacks);

		Map<String, Object> birthday = partyCelebrations.get("Birthday");
		int biscuit = (Integer) birthday.get("Biscuits");
		System.out.println("Biscuits: " + biscuit);
		
		// remove
		// containsKey
		boolean isBiscuitsKeyPresent = snacks.containsKey("Biscuits");
		System.out.println("snacks map object key\t" + isBiscuitsKeyPresent);
		// containsValue
		boolean isVanillaValuePresent = snacks.containsValue("100Kg Vanilla");
		System.out.println("snacks map object value\t" + isVanillaValuePresent);
		// get(Key)
		Map<String, Object> birthdayKey = partyCelebrations.get("Birthday");
		// putAll
		// clear
		
		//get
		// snacks.get("Chocolates"); -- will throw eror saying key is not found
		// getOrDefault
		snacks.getOrDefault("Chocolates", "Kit Kat");
		// putIfAbsent
		snacks.putIfAbsent("Soft Drinks", "pepsi");
		//replace
	}
}
