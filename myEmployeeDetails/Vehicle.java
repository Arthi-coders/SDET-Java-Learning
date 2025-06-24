package myEmployeeDetails;

public class Vehicle {

	public void start() {
		System.out.println("Start the car");
	 }	
	}
class car extends Vehicle{
	public void start() {
		System.out.println("Start the car over");
		
	}
	public static void main(String[] args) {
		Vehicle overrid = new Vehicle();
		overrid.start();
		
		car overrider = new car();
		overrider.start();
	}
	}

