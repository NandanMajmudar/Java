package DesignPatterns;

public class TOIndia extends IObserver {

	IObservable observable;
	String name;
	
	TOIndia(IObservable observable,String name){
		this.observable = observable;
		this.name = name;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String news = observable.getNews();
		System.out.println("TOI Updated: "+news);
	}

}
