package CarSimulation;

public class Bicycle extends WheeledVehicle{
	
	
	Bicycle(String manufacturerName, String modelName,int numberOfGears){
		this.manufacturerName = manufacturerName;
		this.modelName = modelName;
		this.numberOfGears = numberOfGears;
		this.numberOfWheels = 2;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		paddle();
		System.out.println("Moving....");
		paddle();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		brake();
		System.out.println("Stopped....");
	}
	
	private void paddle() {
		System.out.println("Paddling....");
	}
	
	private void brake() {
		System.out.println("Brake....");
	}
	
}
