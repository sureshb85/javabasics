package javaoops;

public class StaticExample {
	
	static int i = 0;
	StaticExample() {
		i = i + 1;
		System.out.println("i " + i);
	}

	// block
	static {
		System.out.println("Static block1");
	}

	static {
		System.out.println("Static block2");
	}

	// static field
	static String subject = "Java";
	
	//static company will remain the same for all the objects
	static String myCompany = "CTS";
	
	//constant
	static final String myCompanyName = "CTS";

	// static method
	static void display() {
		System.out.println("static method");
	}

	void nonStaticmethod() {
		System.out.println("Non Static method");
	}

	//public static void main
	//public - accessible everywhere - since main method is accessed by JVM should be public 
	// Static - to entity/method as class method (because we can access by ClassName - like StaticExample.display(); For JVM no need to create an object
	// void is return type
	// main() - method is the entry point for the JVM (Java Virtual machine) - JVM invokes the Java program by using the main() method
	
	
	
	
	public static void main(String[] args) {
		StaticExample.display();
		System.out.println(StaticExample.subject);

		// non static method
		StaticExample se1 = new StaticExample();
		se1.nonStaticmethod();
		System.out.println(se1.subject);

		StaticExample se2 = new StaticExample();
		se2.nonStaticmethod();
		System.out.println(se2.subject);

		
		System.out.println("Value of first object" + StaticExample.i);
		
		StaticExample se3 = new StaticExample();
		se3.nonStaticmethod();
		System.out.println(se3.subject);

		System.out.println("Total objects: " + StaticExample.i);
	}

}
