package DesignPattern.oo.behavioral.strategy.headfirst;

public class MallardDuck extends Duck{
	
	//FlyBehaviour fb;
	//QuackBehavior qb;
	public  MallardDuck(){
		// fb = new FlyNoWay();
		// qb = new Quack();
		 
		 setFlyBehaviour(new FlyNoWay());
		 setQuackBehaviour(new Quack());
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("i m mallard duck");
	}
	
	

}
