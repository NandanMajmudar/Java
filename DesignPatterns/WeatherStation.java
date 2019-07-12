package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

	List<IObserver> observers;
	String news;
	
	WeatherStation(){
		observers = new ArrayList<IObserver>();
	}
	@Override
	public void addObserver(IObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		// TODO Auto-generated method stub
		String name = observer.name;
		observers.remove(observers.indexOf(observer));
		System.out.println(name+" removed");
	}

	@Override
	public void stateChanged() {
		// TODO Auto-generated method stub
		for(IObserver observer : observers) {
			observer.update();
		}
	}
	
	@Override
	public String getNews() {
		return news;
	}
	
	@Override
	public void setNews(String news) {
		this.news = news;
		stateChanged();
	}

}
