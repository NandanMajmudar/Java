package DesignPatterns;

public class CityDuck extends Duck {

	CityDuck(){
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("City Duck Display");
	}


}
