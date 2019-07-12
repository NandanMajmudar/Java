package DesignPatterns;

public class WildDuck extends Duck{

	WildDuck(){
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Wild Duck Display");
	}

	
}
