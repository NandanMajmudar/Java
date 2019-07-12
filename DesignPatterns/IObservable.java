package DesignPatterns;

public interface IObservable {
	public void addObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void stateChanged();
	public String getNews();
	public void setNews(String news);
}
