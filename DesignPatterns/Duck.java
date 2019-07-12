package DesignPatterns;

public abstract class Duck {
	
	Flyable flyBehaviour;
	Quackable quackBehaviour;
	
	public abstract void display();
	public void performFly() {
		this.flyBehaviour.fly();
	}
	public void performQuack() {
		this.quackBehaviour.quack();
	}
	
	public void setFlyBehaviour(Flyable flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
}
