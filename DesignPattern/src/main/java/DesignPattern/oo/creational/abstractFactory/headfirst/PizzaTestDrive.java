package DesignPattern.oo.creational.abstractFactory.headfirst;

import DesignPattern.oo.creational.abstractFactory.headfirst.pizza.COPizzaStore;
import DesignPattern.oo.creational.abstractFactory.headfirst.pizza.NYPizzaStore;
import DesignPattern.oo.creational.abstractFactory.headfirst.pizza.PizzaStoreFactory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PizzaStoreFactory nyStore = new NYPizzaStore();
PizzaStoreFactory coStore = new COPizzaStore();

nyStore.orderPizza("cheese");

coStore.orderPizza("cheese");

	}

}
