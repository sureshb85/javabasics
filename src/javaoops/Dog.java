package javaoops;

public class Dog {

	// instance variables
	String name;
	String breed;
	int age;
	String color;
	
	// by default JVM will understand the default constructor
	// public Dog() { }

	// parameterized constructor
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	String getName() {
		return name;
	}

	String getBreed() {
		return breed;
	}

	int getAge() {
		return age;
	}

	String getColor() {
		return color;
	}

	public static void main(String args[]) {
		Dog d1 = new Dog("puppy1", "Bulldog", 4, "brown");
		Dog d2 = new Dog("puppy2", "Labrador Retriever", 14, "white");
		Dog d3 = new Dog("puppy3", "Beagle", 24, "black");
		Dog d4 = new Dog("puppy4", "French Bulldog", 34, "brown-white");

		System.out.println(d1.getBreed());
		System.out.println(d2.getBreed());
		System.out.println(d3.getBreed());
		System.out.println(d4.getBreed());
		
		//The objects are called as instances of the class
		//The instances shares the attributes and the behaviors of the class
		//The states are unique for each of the object
	}

}
