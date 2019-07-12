package DesignPatterns;

public class WoodenDuck extends Duck{

	WoodenDuck(){
		this.flyBehaviour = new NoFly();
		this.quackBehaviour = new MuteQuack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Wooden Duck Display");
	}

}
