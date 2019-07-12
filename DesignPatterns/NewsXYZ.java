package DesignPatterns;

public class NewsXYZ extends IObserver {
	
	IObservable observable;	
	
	NewsXYZ(IObservable observable,String name){
		this.observable = observable;
		this.name = name;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String news = observable.getNews();
		System.out.println("NewsXYZ Updated: "+news);
	}

}
