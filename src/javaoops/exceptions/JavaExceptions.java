package javaoops.exceptions;

// An exception is an event, which occurs during the execution of a program, 
// that disrupts the normal flow of the program's instructions.

//The object, called an exception object, contains information about the error, 
// including its type and the state of the program when the error occurred

// Advantage: maintaining the normal flow of the application.

//root class: Throwable
// Exception: IOEXception/ SQLException / ClassNotFoundException / RuntimeException - ArithemeticException / NullPointerException / NumberFormatException 
// Error: StackOverFlow / VirtualMachineError / OutofMemoryError

// Types of Java exceptions
// Checked Exception : exceptional conditions that a well-written application should anticipate and recover from
// Unchecked Exception: exceptional conditions that are internal to the application, and that the application usually cannot anticipate or recover from
// Error: exceptional conditions that are external to the application, and that the application usually cannot anticipate or recover from

// Exception 
// try - catch
// finally
// throw
// throwable
public class JavaExceptions {

	public static void main(String[] args) {
		float divide = 100 / 0;
		System.out.println("Divison " + divide);
		System.out.println("Divison is success");
	}
}
