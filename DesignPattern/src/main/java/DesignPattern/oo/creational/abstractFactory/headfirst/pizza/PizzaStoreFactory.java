package DesignPattern.oo.creational.abstractFactory.headfirst.pizza;

public abstract class PizzaStoreFactory {

	Pizza pizza = null;
	
	public  abstract Pizza createPizza(String item);
		
	public Pizza orderPizza(String type){
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
		
}
