package PolymorphismS8;

public class Car {
	
	private String description;
	
	public Car(String description){
		this.description = description;		
	}
	
	public void startEngine() {
		System.out.println("engine starting...");
		runEngine();
	}
	
	private void runEngine() {
		System.out.println("the " + this.getClass().getSimpleName() + " engine is now running" );
	}
	
	public void drive() {
		System.out.println(this.getClass().getSimpleName() + " is being driven");
	}
	
	

}

class GasPoweredCar extends Car{
	double avgKmPerLitre;
	int cylinders;
	
	public GasPoweredCar(String description, double avgKmPerLitre , int cylinders) {
		super(description );
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
	}
	
	

	@Override
	public void startEngine() {
		super.startEngine();
		System.out.println("on a gas car");
	}
	
	@Override
	public void drive() {
		super.drive();
		
	}
	
}


class ElectricCar extends Car{
	
	private double avgKmPerCharge;
	private int batterySize;
	
	public ElectricCar(String description, double avgKmPerCharge , int batterySize) {
		super(description);
		this.avgKmPerCharge =avgKmPerCharge;
		this.batterySize = batterySize;
	}
	
	
	@Override
	public void startEngine() {
		super.startEngine();
		System.out.println("on an Electric car");
	}
	
	@Override
	public void drive() {
		super.drive();
		
	}
	
	
}
