package DesignPattern.oo.creational.abstractFactory.headfirst.pizza;

import DesignPattern.oo.creational.abstractFactory.headfirst.Cheese;
import DesignPattern.oo.creational.abstractFactory.headfirst.Clam;
import DesignPattern.oo.creational.abstractFactory.headfirst.Dough;
import DesignPattern.oo.creational.abstractFactory.headfirst.Pepperoni;
import DesignPattern.oo.creational.abstractFactory.headfirst.Sauce;
import DesignPattern.oo.creational.abstractFactory.headfirst.Veggies;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies;
	Clam clam;
	Cheese chesse;
	Pepperoni pepp;
	
	abstract void prepare();
	
	void bake(){
		
	}
	
	void box(){
		
	}
	void cut(){
		
	}
	
	void setName(String name){
		this.name = name;
	}
}
