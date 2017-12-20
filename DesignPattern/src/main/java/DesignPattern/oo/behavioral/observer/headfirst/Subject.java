package DesignPattern.oo.behavioral.observer.headfirst;

public interface Subject {
// this is news papaer
	
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
