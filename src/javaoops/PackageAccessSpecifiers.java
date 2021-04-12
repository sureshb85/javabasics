package javaoops;

/* A java package is a group of similar types of classes, interfaces and sub-packages.

Java packages consists of built-in package and user-defined package.

Java built-in packages such as java, lang, io, util, sql etc.
*/

/*
Java package advantages: 
categorize the classes and interfaces into packages for easy maintenance 
provides access protection.
removes naming collision.

*/

// package naming convention - reverse domain name
// Example:
// com.cognizant.training.osp.javabasics
// com.cognizant.training.osp.javaoops
// com.cognizant.training.osp.seleniumbasics
// com.cognizant.training.osp.ospbasics

class PrivateAccess {

	// private constructor
	/*
	 * private PrivateAccess() {
	 * 
	 * }
	 */
	// Cann't create object outside of the class
	private int id = 10;

	private void printId() {
		System.out.println("Id ");
	}
}

class DefaultAccess {

	// not specifying any access like private, public, protected, default
	int rank = 50;

	void printRank() {
		System.out.println("Rank");
	}
}


class PublicAccess {

	// not specifying any access like private, public, protected, default
	int myRank = 50;

	void printmyRank() {
		System.out.println("Rank");
	}
}

class Parent {
	protected void display() {
		System.out.println("Parent Display method");
	}
}

class Child extends Parent {
	public static void main(String[] args) {
		Child c  = new Child();
		c.display();
	}
}


public class PackageAccessSpecifiers {

	// different access specifiers
	// default
	// private is only accessible within a class and not outside of the class
	// public
	// protected

	public static void main(String[] args) {
		PrivateAccess pa = new PrivateAccess();

		// uncomment below lines
		// pa.id;
		// compile time error

		// pa.printId();
		// compile time error
		
		DefaultAccess da = new DefaultAccess();
		System.out.println(da.rank);
		da.printRank();
		
		PublicAccess pac = new PublicAccess();
		System.out.println(pac.myRank);
		pac.printmyRank();
	}
}
