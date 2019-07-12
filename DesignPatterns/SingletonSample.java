package DesignPatterns;

public class SingletonSample {
	private static SingletonSample singletonSample;
	
	private SingletonSample() {
		System.out.println("Inside Constructor");
	}
	
	public synchronized static SingletonSample getInstance() {
		if(singletonSample == null) {
			singletonSample = new SingletonSample();
		}
		return singletonSample;
	}

}
