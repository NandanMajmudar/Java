package DesignPatterns;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//SINGLETON DRIVER CODE
//		SingletonSample s1 = SingletonSample.getInstance();
//		SingletonSample s2 = SingletonSample.getInstance();
//		
//		if(s1 == s2) {
//			System.out.println("I'm the only one");
//		}
//		else {
//			System.out.println("We r two");
//		}
		
		
		//STRATEGY DRIVER CODE
//		RubberDuck rubberDuck = new RubberDuck();
//		rubberDuck.display();
//		rubberDuck.performFly();
//		rubberDuck.performQuack();
//		
//		WoodenDuck woodenDuck = new WoodenDuck();
//		woodenDuck.display();
//		woodenDuck.performFly();
//		woodenDuck.performQuack();
//		
//		CityDuck cityDuck = new CityDuck();
//		cityDuck.display();
//		cityDuck.performFly();
//		cityDuck.performQuack();
//		cityDuck.setFlyBehaviour(new NoFly());
//		cityDuck.performFly();
		
	    //Observer Driver Code

//		WeatherStation ws = new WeatherStation();
//		IObserver timesOfIndia = new TOIndia(ws,"TOI");
//		IObserver NewsXYZ = new NewsXYZ(ws,"NewsXYZ");
//		ws.addObserver(timesOfIndia);
//		ws.addObserver(NewsXYZ);
//		ws.setNews("28 Degrees");
//		ws.removeObserver(timesOfIndia);
//		ws.setNews("19 Degrees");
		
		//ADAPTER DRIVER CODE
		String latlongString = "19,23";
		GoogleAPIAdapter gAdapter = new GoogleAPIAdapter();
		String weather = gAdapter.getWeather(latlongString);
		
		WeatherComAPIAdapter wAdapter = new WeatherComAPIAdapter();
		String weather2 = wAdapter.getWeather(latlongString);
		System.out.println(weather2);
	}

}
