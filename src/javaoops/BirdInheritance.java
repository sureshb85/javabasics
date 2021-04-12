package javaoops;


//inheritance allows to create a child classes that inherit the fields and methods of the parent class.
// A class can extend another class (parent) by inheriting the parent class features
// Implements the DRY (Don't Repeat yourself) programming/oops principle.
// improves the code reusability
// Multilevel inheritance is allowed in java
// Multiple inheritance is not allowed in java

// single
// multilevel
// Hierarchical inheritance

// NOT the Multiple inheritance

class Birds {
	
	String reporduction = "eggs";
	String outerCovering = "feather";
	
	public void flyUp() {
		System.out.println("Flying up");
	}
	
	public void flyDown() {
		System.out.println("Flying down");
	}
	
	public void speed() {
		System.out.println("Speeding details");
	}
	
}

class EagleBird extends Birds {
	
	String name = "Eagle";
	int lifespan = 10;
	String food = "meat";
	
	public void speed() {
		System.out.println("Eagle flying speed is high");
	}
}

class ParrotBird extends Birds {
	String name = "parrot";
	int lifespan = 20;
	String food = "grains";
	
	public void speed() {
		System.out.println("Parrot flying speed is medium");
	}
}

class SparrowBird extends Birds {
	String name = "Eagle";
	int lifespan = 5;
	String food = "grains";
	
	public void speed() {
		System.out.println("Sparrow flying speed is low");
	}
}



public class BirdInheritance {
	public static void main(String[] args) {
		EagleBird e1 = new EagleBird();
		ParrotBird p1 = new ParrotBird();
		SparrowBird s1 = new SparrowBird();
		System.out.println("Eagle " + e1.name + " -- " + e1.lifespan +  " -- " + e1.food + " -- " + e1.reporduction + " -- " + e1.outerCovering);
		e1.flyDown();
		e1.flyUp();
		e1.speed();
		System.out.println("Parrot " + p1.name + " -- " + p1.lifespan +  " -- " + s1.food+ " -- " + e1.reporduction + " -- " + e1.outerCovering);
		p1.flyDown();
		p1.flyUp();
		p1.speed();
		System.out.println("Sparrow " + s1.name + " -- " + s1.lifespan +  " -- " + p1.food+ " -- " + e1.reporduction + " -- " + e1.outerCovering);
		s1.flyDown();
		s1.flyUp();
		s1.speed();
	}
}