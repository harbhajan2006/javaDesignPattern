package DesignPattern.oo.behavioral.observer.headfirst;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WeatherData w = new WeatherData();

CurrentConditionDisplay d1= new CurrentConditionDisplay(w);

w.setMeasurement(2, 4, 6);
w.setMeasurement(12, 14, 16);
w.setMeasurement(22, 24, 26);
	}

}
