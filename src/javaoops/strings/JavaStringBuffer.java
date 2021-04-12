package javaoops.strings;

// to create mutable string
// same as String class apart from mutable
// is a thread-safe - Multiple threads cann't access it simultaneously
public class JavaStringBuffer {

	public static void main(String[] args) {

		// overloaded constructor
		// String buffer with initial capacity
		// specific string
		// with specific capacity

		StringBuffer sb = new StringBuffer();
		sb.append("Java");
		System.out.println(sb);

		// insert
		sb.insert(4, "Selenium");
		System.out.println(sb);

		// replace
		sb.replace(4, 12, " ");
		System.out.println(sb);

		// delete
		sb.delete(1, 2);
		System.out.println(sb);
		
		sb = new StringBuffer("Selenium");
		StringBuffer sr  = sb.reverse();
		System.out.println(sr);
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("This is string");
		String sb2 = sb1.substring(5);
		System.out.println(sb2);
		
	}
}
