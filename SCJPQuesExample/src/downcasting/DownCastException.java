package downcasting;

public class DownCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Super sp1 = new Super();
Super sp2 = new Sub();

// this cause class cast exception because sp1 is of super object actually.
//Sub sb1 = (Sub)sp1;
Sub sb2 = (Sub)sp2;
	}

}

class Super {}
class Sub extends Super {}
