package CarSimulation;

public class VehicalSim {
	public static void main(String args[]) {
		CarFactory carFactory = CarFactory.getCarFactory();
		Car car = carFactory.getCar(5);
		System.out.println(car.modelName);
		car.move();
		
	}
}
