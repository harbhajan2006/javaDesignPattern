package DesignPattern.oo.creational.abstractFactory.headfirst;

public class COPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new Dough2();
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
			return null;
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new Cheese2();
	}

	public Veggies createVeggies() {
		// TODO Auto-generated method stub
			return new Veggie2();
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
