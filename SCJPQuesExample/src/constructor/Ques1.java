package constructor;

public class Ques1 {
	public static void main(String [] args) {
		new Bottom2("C");
		System.out.println(" ");
		}
}

class Top {
public Top(String s) { System.out.print("B"); }
}
 class Bottom2 extends Top {
public Bottom2(String s) { 
	//super();
	//or
	// this();
	System.out.print("D");
	}
 }