package exception;

public class Gotcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gotcha().go();
		// this will hande error
		try { new Gotcha().go(); }
		catch (Error e) { System.out.println("ouch error"); }
		
		try { new Gotcha().go(); }
		catch (Exception e) { System.out.println("ouch"); }
	}

	void go() {
		 go();
		 
		 }
	
}
