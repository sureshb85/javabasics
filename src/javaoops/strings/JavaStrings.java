package javaoops.strings;

public class JavaStrings {

	// constant - we can't change the value
	// similarly for String we can't change the value
	public static void main(String[] args) {
		String name = "Java";
		// String literal
		String course1 = "Java";
		String course2 = "Java";

		// by new keyword
		String firstName = new String("Java");
		System.out.println(name + " -- " + firstName);
		name.concat("Selenium");
		System.out.println("concat \t" + name);

		// better/efficient memory utilization
		// In Java all the String are stored in String pool
		System.out.println(course1.hashCode() + " -- " + course2.hashCode());

		course2 = "Selenium";
		String course3 = "Selenium";
		System.out.println(course1.hashCode() + " -- " + course2.hashCode() + " -- " + course3.hashCode());

		boolean endsWith = course3.endsWith("Java");
		System.out.println(endsWith);

		boolean startsWith = course3.startsWith("Sele");
		System.out.println(endsWith);

		System.out.println(course3.length());

		// charAt()
		for (int i = 0; i < course3.length(); i++) {
			System.out.println(course3.charAt(i));
		}

		System.out.println(course3.toLowerCase());
		System.out.println(course3.toUpperCase());

		boolean result = course2.equals(course3);
		System.out.println(result);

		int value = course2.compareTo(course3);
		// 0 equals
		// 1
		// -1
		System.out.println(value);

		String apple = "aa";
		String boy = "bb";
		value = apple.compareTo(boy);
		System.out.println(value);

		value = boy.compareTo(apple);
		System.out.println(value);

		String n1 = "selenium";
		String n2 = "SELENIUM";
		boolean res = n1.equalsIgnoreCase(n2);
		System.out.println(res + " -- " + n1.equals(n2));

		String sentence = "This is a sentence";
		String[] multipleWords = sentence.split(" ");
		for (int i = 0; i < multipleWords.length; i++) {
			System.out.println(multipleWords[i]);
		}

		
		//split and trim methods
		String sentence1 = "This is a sentence, second line will start, third line, fourth line";
		String[] multipleWords1 = sentence1.split(",");
		for (int i = 0; i < multipleWords1.length; i++) {
			System.out.println(multipleWords1[i].trim());
		}
		
		String joinString = String.join(",", "Join method", "Java", "Selenium");
		System.out.println(joinString);
	
		System.out.println(sentence1.substring(10, 14));
	}

}
