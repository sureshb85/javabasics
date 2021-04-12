package javaoops;

//Hiding or protecting the data stored in class from outside the world. safeguarding the internal contents of a class.
//How to achieve encapsulation with Java
//Make the states or behaviors as private to a class

//Restricts direct access to data members or fields of a class
// Fields are set to private
// each field should have setter and getter methods
// setter method allows to change the value of the field
// getter methods returns the field value

public class DogEncapsulation {

	private String name;
	private int age;

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	// getter
	public int getAge() {
		return age;
	}

	// setter
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		DogEncapsulation de = new DogEncapsulation();

		// calling setters to store the value
		de.setName("Puppy");
		de.setAge(23);

		// calling getter to fetch/retrieve the value
		int age = de.getAge();
		String name = de.getName();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

}
