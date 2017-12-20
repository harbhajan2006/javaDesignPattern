package DesignPattern.oo.creational.abstractFactory.headfirst;

public interface PizzaIngredientFactory {

	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies createVeggies();
	Clam createClam();
	Pepperoni createPepperoni();
}
