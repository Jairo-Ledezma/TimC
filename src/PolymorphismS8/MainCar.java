package PolymorphismS8;

public class MainCar {

	public static void main(String[] args) {
		Car gasCar = new GasPoweredCar ("Fancy" , 2.5, 5);
		
		gasCar.startEngine();
		gasCar.drive();
		System.out.println(".".repeat(50));
		
		Car eCar =  new ElectricCar("fancier" ,2.5 , 15000);
		eCar.startEngine();
		eCar.drive();
		System.out.println(".".repeat(50));
		
		Car car = new Car ("Fancy");
		car.startEngine();
		car.drive();
		

	}

}
