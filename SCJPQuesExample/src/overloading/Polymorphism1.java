package overloading;

public class Polymorphism1 {
	public static void main(String[] args) { new Polymorphism1().go(); }
	 void go() {
	 new Hound().bark();
	 ((Dog) new Hound()).bark();
	 ((Dog) new Hound()).sniff();
	 }
	 

}


 class Dog {
 public void bark() { System.out.print("woof "); }
 }
 class Hound extends Dog {
 public void sniff() { System.out.print("sniff "); }

 public void bark() { System.out.print("howl "); }
 }
