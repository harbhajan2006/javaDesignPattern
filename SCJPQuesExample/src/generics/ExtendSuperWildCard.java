package generics;

import java.util.ArrayList;
import java.util.List;

public class ExtendSuperWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<? extends Animal> readList = new ArrayList<Animal>();
// exted is used for read operations ans super is used for insert operations.
//readList.add(new Dog()); this line will give compile error

// extend is upperbound and super is lowerbound
List<? super Animal> insesrtList = new ArrayList<Animal>();
	insesrtList.add(new Dog());
	insesrtList.add(new Cat());
	insesrtList.add(new snake());
	}
//https://www.journaldev.com/1663/java-generics-example-method-class-interface
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
interface Animal1{}
class snake extends Animal{}
class bird implements Animal1{}
