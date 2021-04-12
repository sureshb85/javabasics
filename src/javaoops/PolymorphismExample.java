package javaoops;


//Abstraction
// Inheritance
// Encapsulation
// class
// object
// Access Specifiers
// package
// Static blocks, methods
// constants
// interface

// polymorphism: means "many forms" 
// Overloading -- compile time 
// Overriding -- runtime

class Addittion {
	
	int add(int num1, int num2, int num3) {
		//System.out.println(num1 + num2 + num3 );
		return num1 + num2 + num3;
	}
	
	void add(int num1, int num2) {
		System.out.println(num1 + num2 );
	}

	
	float add(float num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
		return num1 + num2 + num3;
	}


}



//Overriding -- runtime
// if a subclass is having a same method as parent class

// rules:
// must have same name as parent class method
//  must have same parameters as parent class method
// IS-A relationship(Inheritance)

class Vehicles {
	
	public void engine() {
		System.out.println("Vehicle engine");
	}
}

class BMW extends Vehicles {
	
	public void engine() {
		super.engine();
		System.out.println("BMW engine");
	}
	
	public void gear() {
		System.out.println("BMW Gears");
	}
}




public class PolymorphismExample {

	
	// main method signature or declaration
	
	// method access specifier
	// method return type
	// method name
	// optional: method parameters within a brackets
	public static void main(String[] args) {
		Addittion ad = new Addittion();
		ad.add(10, 10);
		// compile time error
		// ad.add(10, 20.50f);
		int sum_of_three_integers = ad.add(10, 10, 10);
		System.out.println("add(int num1, int num2, int num3):  " + sum_of_three_integers);
		ad.add(20.50f, 10, 10);
		
		
		//overriding
		BMW b = new BMW();
		b.engine();
		b.gear();
		
	}

}
