package overloading;
// this class shows calling a overridden method could be dangerous inside a constructor...
import java.util.Date;

class Super1 {
	// Broken - constructor invokes an overridable method
	public Super1() {
		System.out.println("i m in base class before constructor...");
	overrideMe();
	}
	public void overrideMe() {
		System.out.println("i m in base class");
	}
	}


public final class Super extends Super1 {
private final Date date; // Blank final, set by constructor
Super() {
date = new Date();
}
// Overriding method invoked by superclass constructor
@Override public void overrideMe() {
	//super.super.overrideMe();
System.out.println(date);
}
public static void main(String[] args) {
	Super sub = new Super();
sub.overrideMe();
}
}
