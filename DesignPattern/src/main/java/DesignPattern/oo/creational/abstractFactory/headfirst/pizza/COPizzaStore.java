package DesignPattern.oo.creational.abstractFactory.headfirst.pizza;

import DesignPattern.oo.creational.abstractFactory.headfirst.COPizzaIngredientFactory;
import DesignPattern.oo.creational.abstractFactory.headfirst.PizzaIngredientFactory;

public class COPizzaStore extends PizzaStoreFactory {

	PizzaIngredientFactory pif = new COPizzaIngredientFactory();
	@Override
	public Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese")){
			return new COStyleCheesePizza(pif);
		} else if(item.equals("veggie")){
			return new COStyleVeggiePizza();
		} else if(item.equals("clam")){
			return new COStyleClamPizza();
		}else if(item.equals("pepp")){
			return new COStylePepperoniPizza();
		}
		return pizza;
	}

}
