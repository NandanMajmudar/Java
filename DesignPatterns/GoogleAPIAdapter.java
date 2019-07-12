package DesignPatterns;

public class GoogleAPIAdapter implements APIAdaptable {

	@Override
	public String getWeather(String latlongString) {
		// TODO Auto-generated method stub
		String[] latlongStringArr = latlongString.split(",");
		int arr[] = new int[2];
		arr[0] = Integer.parseInt(latlongStringArr[0]);
		arr[1] = Integer.parseInt(latlongStringArr[1]);
		GoogleAPI googleAPI = new GoogleAPI();
		String mssg = googleAPI.getWeatherInfo(arr);
		return mssg;
	}

}
