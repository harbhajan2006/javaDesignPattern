package DesignPattern.oo.behavioral.observer.marketSubscription;

import java.util.ArrayList;

import DesignPattern.oo.behavioral.observer.marketSubscription.Observer;

public class FashionMarket implements Subject{

	public FashionMarket() {
		// TODO Auto-generated constructor stub
		observers= new ArrayList<Observer>();
	}
	private ArrayList<Observer> observers;
	
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
		o.update();
	}	
	}
	
	public void dressAvaliable(){
		notifyObservers();
	}
}
