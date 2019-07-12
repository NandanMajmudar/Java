package CarSimulation;

public abstract class Vehicle {
	String manufacturerName;
	String modelName;
	int price;
	
	public abstract void move();
	public abstract void stop();
}
