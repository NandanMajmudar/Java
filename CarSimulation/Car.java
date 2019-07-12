package CarSimulation;

public class Car extends WheeledVehicle {
	
//	public Car(String manufacturerName,String modelName){
//		this.manufacturerName = manufacturerName;
//		this.modelName = modelName;
//		this.numberOfGears = 5;
//		this.numberOfWheels = 4;
//	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		ignite();
		accelerate();
		System.out.println("Moving....");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		brake();
		System.out.println("Stopped....");
	}
	
	private void ignite() {
		System.out.println("Ignition....");
	}
	
	private void accelerate() {
		System.out.println("Acceleration....");
	}
	
	private void brake() {
		System.out.println("Brake....");
	}
}
