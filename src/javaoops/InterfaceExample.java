package javaoops;

// similar like class - Interfaces can have methods and fields or constants,
// the methods are abstract (only method signature without body)

// interfaces say what class must do and not how and it's blue print of the class
//Example:
//An interface is about capabilities like Vehicle having engine() method 
//and any class (like BMW, Ford, Maruti) using the Vehicle interface must implement the Engine() method

// If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.

//Interface
// by default all methods are public 
// all fields are public static final
// interfaces can have private methods // Java 9 version
// can have default and static methods // from Java 8

// an interface can extend another interface
// Can't create instance/object of interfaces
// a class can implement more then one interface


// Multiple inheritance
// loose coupling
interface Vehicle {
	String ENGINESTANDARDS = "BSVI";
	
	public void engine();
	public void changeGear();
	void speedUp();
	void applyBrakes();
	
    default void vehicleInfo()
    {
        System.out.println("Vehicle interface Specifications");
    }
    
    static void vehicleDisplay()
    {
        System.out.println("Vehicle interface display");
    }
}

interface Cars {
	
	public static final String NOOFGEARS = "6";
	void compactCar();
	void sedancar();
	void hatchbackcar();
}

class BMWMotors implements Vehicle, Cars {


	@Override
	public void engine() {
		System.out.println("BMWMotors Engine specifications");

	}

	@Override
	public void changeGear() {
		System.out.println("BMWMotors Changing Gear");
		
	}

	@Override
	public void speedUp() {
		System.out.println("BMWMotors speed Up");
		
	}

	@Override
	public void applyBrakes() {
		System.out.println("BMWMotors Applying brakes");
		
	}

	@Override
	public void compactCar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sedancar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hatchbackcar() {
		// TODO Auto-generated method stub
		
	}


}

public class InterfaceExample {
	
	public static void main(String[] args) {
		BMWMotors bc = new BMWMotors();
		bc.engine();
		bc.vehicleInfo();
		Vehicle.vehicleDisplay();
		System.out.println("Engine Version" + Vehicle.ENGINESTANDARDS);
	}
}
