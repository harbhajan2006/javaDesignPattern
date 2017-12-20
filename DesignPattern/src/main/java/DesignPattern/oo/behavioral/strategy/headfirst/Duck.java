package DesignPattern.oo.behavioral.strategy.headfirst;

public abstract class Duck {

public	FlyBehaviour f;
public	QuackBehavior q;
	
	public Duck(){
		
	}
	abstract void display();
	
	
public void setFlyBehaviour(FlyBehaviour fb){
		f=fb;
	}


public void setQuackBehaviour(QuackBehavior qb){
	q=qb;
}


public void performFly(){
	f.fly();
}
	public void performQuack(){
		q.quack();
	}
	


public void performSwim(){
	
}
}
