package innerClass;




public class InnerClass1 {
 public static void main(String[] args) {
	 
	 
 Cathedral c = new Cathedral();
 // insert code here
 Cathedral.Sanctum s = c.new Sanctum();
 s.go();
 }
 }
 class Cathedral {
 class Sanctum {
 void go() { System.out.println("spooky"); }
 }
 }