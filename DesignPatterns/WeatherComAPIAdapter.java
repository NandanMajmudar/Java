package DesignPatterns;

public class WeatherComAPIAdapter implements APIAdaptable{

	@Override
	public String getWeather(String latlongString) {
		// TODO Auto-generated method stub
		String[] latlongStringArr = latlongString.split(",");
		int x = Integer.parseInt(latlongStringArr[0]);
		int y = Integer.parseInt(latlongStringArr[1]);
		WeatherComAPI wCAPI = new WeatherComAPI();
		String mssg = wCAPI.getWeatherBasedOnLocation(x, y);
		return mssg;
	}

}
