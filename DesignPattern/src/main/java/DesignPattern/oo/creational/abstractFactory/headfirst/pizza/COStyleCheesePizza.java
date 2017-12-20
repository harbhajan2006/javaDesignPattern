package DesignPattern.oo.creational.abstractFactory.headfirst.pizza;

import DesignPattern.oo.creational.abstractFactory.headfirst.PizzaIngredientFactory;

public class COStyleCheesePizza extends Pizza {
	PizzaIngredientFactory pif;
public 	COStyleCheesePizza (PizzaIngredientFactory fact){
	pif=fact;
}
	
	@Override
	void prepare() {
		// TODO Auto-generated method stub
dough = pif.createDough();
chesse = pif.createCheese();
clam = pif.createClam();
veggies = pif.createVeggies();
	}

}
