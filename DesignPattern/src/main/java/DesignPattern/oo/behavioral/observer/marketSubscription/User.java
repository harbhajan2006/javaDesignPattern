package DesignPattern.oo.behavioral.observer.marketSubscription;

public class User implements Observer{
	FashionMarket m;
	String userName;
	public User(FashionMarket m){
		this();
		this.m=m;
		m.registerObserver(this);
		
	}
	
	
	public void setUserName(String name){
		this.userName=name;
	}
	public User(){
		
	}
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( userName +  " got dress");
	}

}
