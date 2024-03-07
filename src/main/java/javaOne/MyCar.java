package javaOne;

public class MyCar {
	
	//declare variables inside a class
	// access from all the methods with in the class
	
	byte noOfWheels = 4;
	short fuelCapacity = 250;
	int carCurrentPrice = 800000;
	long carNewPrice = 1200000000L;
	
	float kmsRun = 546.8908F;
	double carValue = 78688.309894937498374;
	
	char fuelType = 'P';
	// this variable can access from any package and any class and any methods.	
	public boolean isPunture = false;
	//****
	String  brandName = "Hyundai";
	
	public void runCar() {
		System.out.println("Run Car");
		System.out.println(noOfWheels);
	}
	
	public void stopCar() {
		System.out.println("Stop Car");
		System.out.println(carValue);
	}
	
	public static void main(String[] args) {
		MyCar startCar = new MyCar();
		
		startCar.runCar();
		startCar.stopCar();
		// to call variable from main method
		//use objects
		System.out.println(startCar.brandName);
	}

}
