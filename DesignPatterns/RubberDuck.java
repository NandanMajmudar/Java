package DesignPatterns;

public class RubberDuck extends Duck{

	RubberDuck(){
		this.flyBehaviour = new NoFly();
		this.quackBehaviour = new Squeak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Rubber Duck Display");
	}


}
