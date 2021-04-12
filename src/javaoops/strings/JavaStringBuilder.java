package javaoops.strings;

//to create mutable string
//same as String class apart from mutable
//is not a thread-safe
public class JavaStringBuilder {

	public static void main(String[] args) {

		// overloaded constructor
		// String buffer with initial capacity
		// specific string
		// with specific capacity

		StringBuilder sb = new StringBuilder();
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

		sb = new StringBuilder("Selenium");
		StringBuilder sr = sb.reverse();
		System.out.println(sr);
	}
}
