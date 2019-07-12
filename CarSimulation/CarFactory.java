package CarSimulation;

public class CarFactory {
	
	private static CarFactory carFactory;
	Car car;
	private CarFactory() {
		
	}
	public synchronized static CarFactory getCarFactory() {
		if(carFactory == null) {
			carFactory = new CarFactory();
		}
		return carFactory;
	}
	
	public Car getCar(int budget) {
		if(budget<10) {
			car = new Alto();
		}
		else if(budget>10 && budget <20) {
			car = new Verna();
		}
		else {
			car = new Audi();
		}
		return car;
	}
}
