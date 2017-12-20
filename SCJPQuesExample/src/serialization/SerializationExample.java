package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable {

	//private static final long serialVersionUID = -6470090944414208496L;
	private String name;
	private int age;
	static String dept;
	transient int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getDept() {
		return dept;
	}
	public static void setDept(String dept) {
		SerializationExample.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SerializationExample ser = new SerializationExample();
		ser.serialize();
	}
	@Override
	public String toString() {
		return "SerializationExample [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	private  void serialize() throws FileNotFoundException, IOException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ser.txt"));
		out.writeObject(this);
		out.flush();
		out.close();
	}
}
