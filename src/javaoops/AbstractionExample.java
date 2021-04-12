package javaoops;


// Abstraction will hide the complexity from the users and shows only the relevant information.
//example:
// You don't need to know how the car engine is working internally
// but how to drive the car

// hide the internal implementation details by using the abstract class or interfaces


abstract class Animals {
	
	abstract void move();
	abstract void eat();
	
	void name() {
		System.out.println("Animals name");
	}
}

class Lion extends Animals {

	@Override
	void move() {
		System.out.println("Moves on four legs");	
	}

	@Override
	void eat() {
		System.out.println("Eats other animals");
	}
	
}

class Cow extends Animals {

	@Override
	void move() {
		System.out.println("Moves on four legs");	
	}

	@Override
	void eat() {
		System.out.println("Eats grass");
	}
	
}

public class AbstractionExample {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.move();
		l.eat();
		l.name();
	}

}
