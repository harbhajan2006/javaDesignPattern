package DesignPattern.oo.creational.abstractFactory.headfirst.pizza;

public class NYPizzaStore extends PizzaStoreFactory {

	@Override
	public Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese")){
			return new NYStyleCheesePizza();
		} else if(item.equals("veggie")){
			return new NYStyleVeggiePizza();
		} else if(item.equals("clam")){
			return new NYStyleClamPizza();
		}else if(item.equals("pepp")){
			return new NYStylePepperoniPizza();
		}
		return pizza;
		
	}

}
