package javaoops.exceptions;

import java.io.IOException;

import javax.swing.text.ChangedCharSetException;

// If superclass method doesnt declare an exception then subclass can't declare checked exception however subclass can have declare unchecked 
// If superclass method declares an exception, subclass overridden method can declare same, subclass exceptions of parent class or no exception and not the parent exception of superclass method declaration

class Parent {

	public void div() throws IOException {
		System.out.println("Parent divsion");
	}
}

class child extends Parent {
	public void div() throws ChangedCharSetException {
		System.out.println("Subclass division");
	}
}

public class InheritanceException {

}
