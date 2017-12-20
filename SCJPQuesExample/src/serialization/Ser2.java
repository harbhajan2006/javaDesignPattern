package serialization;
import java.io.*;
public class Ser2 {

	public static void main(String[] args) {
		Car c = new Car();
		Ford f = new Ford();
		Dodge d = new Dodge();
	
if(c instanceof Serializable) System.out.println("car");
if( f instanceof Serializable) System.out.println("ford");
if(d instanceof Serializable) System.out.println("dodge");
}
}
 class Vehicle { }
 class Wheels { }
 class Car extends Vehicle implements Serializable { }
 class Ford extends Car { }
 class Dodge extends Car {
 Wheels w = new Wheels();
 }
