package S8_Inheritance;

public class MainCar {

	public static void main(String[] args) {
		
		
		Car car = new Car();
		
		car.setMake("Porshe");
		car.setModel("Carrera");
		car.setColor("black");
		car.setDoors(2);
		car.setConverible(true);
		
		car.describeCar();
		
		//System.out.println(car.getMake());
		//System.out.println(car.getModel());
		
		Car targa = new Car();
		
		targa.setMake("Porshe");
		targa.setModel("targa");
		targa.setColor("red");
		targa.setDoors(2);
		targa.setConverible(false);
		targa.describeCar();
	}

}
