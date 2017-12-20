package DesignPattern.oo.behavioral.strategy.headfirst;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Duck m = new MallardDuck();
m.performFly();
m.performQuack();

m.setFlyBehaviour(new FlyWithWings());

m.performFly();

	}

}
