package serialization;

import java.io.*;

public class Car1 implements Serializable{

	private int speed =20;
	private int wheel=4;


public static void main(String[] args) {
	try{

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("a.txt"));
		Car1 c = new Car1();
		os.writeObject(c);
		os.writeInt(c.speed);
		os.writeInt(c.wheel);
		//os.flush();
		os.close();

		}catch(Exception ex){
		System.out.println(ex.getMessage());
		}


		try{

		ObjectInputStream is = new ObjectInputStream(new FileInputStream("a.txt"));

		//System.out.println(x);
		System.out.println(is.readInt());
		System.out.println(is.readInt());
		
		is.close();
		}catch(Exception ex){
			
			System.out.println(ex.getMessage());
		}
}


}