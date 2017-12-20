package feature.defaultMethodAndInterface;

public class DefaultMethodExample 
implements DefaultMethodInterface , DefaultInterface2{

	//DefaultMethodInterface d;

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		DefaultInterface2.super.defaultMethod();
	}

	public static void main(String[] args) {
		DefaultMethodExample d = new DefaultMethodExample();
		d.defaultMethod();
	}
}

interface DefaultInterface2{
	
	void abstractMethod();
	default void defaultMethod(){
		System.out.println("i m default method");
	}
	
}