package DesignPattern.oo.behavioral.observer.headfirst;

public class CurrentConditionDisplay implements Observer , DisplayElement{

	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	CurrentConditionDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("current cond" + temp + "--" + humidity + "--" + pressure);
	}

	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}

}
