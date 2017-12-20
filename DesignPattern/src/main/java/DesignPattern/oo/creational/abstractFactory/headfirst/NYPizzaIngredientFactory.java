package DesignPattern.oo.creational.abstractFactory.headfirst;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new Dough1();
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
			return null;
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Cheese1();
	}

	public Veggies createVeggies() {
		// TODO Auto-generated method stub
			return new Veggie1();
	}

	public Clam createClam() {
		// TODO Auto-generated method stub
return null;
	}

	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
return  null;
	}

}
