package javaoops.exceptions;

// throw exception: used to explicitly throw an exception and used for both checked and unchecked exceptions
// can't propagate
// within the method
// can't throw multiple exceptions

// throws exception: to declare a exception on method level
// can propagate
// used with method signature
// can declare multiple exceptions

public class ExceptionThrows {

	public static void main(String[] args)
			throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException {
		// int div = 100 / 0;
		div();
		System.out.println("Divison is executed");
	}

	static void div() {
		throw new ArithmeticException();
	}
}
