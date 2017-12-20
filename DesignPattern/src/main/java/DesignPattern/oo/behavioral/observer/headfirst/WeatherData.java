package DesignPattern.oo.behavioral.observer.headfirst;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers= new ArrayList();
	}
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		if(observers.indexOf(o)>=0)
		observers.remove(o);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
	for(Observer o: observers){
		o.update(temp, humidity, pressure);
	}	
	}
	
	public void measurementChanged(){
		notifyObservers();
	}

	public void setMeasurement(float temp, float humid , float pressure){
		this.temp= temp;
		this.pressure=pressure;
		this.humidity=humid;
		measurementChanged();
	}
}
