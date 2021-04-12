package javacollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class QueueExample {
	public static void main(String[] args) {
		Deque<String> vehicledeque = new ArrayDeque<String>();
		vehicledeque.add("BMW");
		vehicledeque.add("Audi");
		vehicledeque.add("Maruti");
		vehicledeque.add("Tata");
		vehicledeque.add("BMW");
		vehicledeque.add("Audi");

		System.out.println("size of vehicledeque " + vehicledeque.size());
		Iterator<String> itrator = vehicledeque.iterator();
		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}
		// using for loop
		for (String vehicle : vehicledeque) {
			System.out.println(vehicle);
		}
		
//		contains
//		pop
//		addAll
//		removeLastoccurrence
//		removeFirstOccurrence
//		getLast
//		getFirst
//		removeLast
//		removeFirst
//		addLast
//		addFirst
//		add
// 		push
		System.out.println(vehicledeque.getLast());
		System.out.println(vehicledeque.getFirst());
		vehicledeque.addFirst("Maruti First");
		vehicledeque.addLast("Tata Last");
		System.out.println(vehicledeque);
		
	}
}
