package javaoops;

// The finally block always executes when the try block exits. 
// This ensures that the finally block is executed even if an unexpected exception occurs

//  The finally block is a key tool for preventing resource leaks. 
// Closing a file - place the code in a finally block to close the connection (file, scanner, database).

/* try {
 * } finally {
 * }
 * 
 * 
 * 
 * try {
 * } catch {
 * }finally {
 * }
 */
public class ExecptionFianlly {
	public static void main(String args[]) {

		int a[] = null;
		try {
			int divide = a[1] / 0;
			System.out.println("Division by zero " + divide);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: --> " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: --> " + e);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: --> " + e);
		} catch (Exception e) {
			System.out.println("Exception " + e);
		} finally {
			System.out.println("Finally - Program executed successfully");
		}
	}
}
