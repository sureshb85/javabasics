package javaoops.exceptions;




// custom / user defined exception
class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			throw new MyException("Mycsutom Exception message");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
