package innerClass;

public class HorseTest {
	static String test;
 public static void main(String[] args) {
 class Horse {
 public final String name;
 public Horse(String s) {
 name = s;
 }
 
String display(){
	return name;}
 }
 Horse obj = new Horse("Zippo");
 Object obj1 = new Horse("Zippo");
 System.out.println(obj.name);
 //this will not work here using Object reference for Horse.	
 //System.out.println(obj1.name);
 }
 }
