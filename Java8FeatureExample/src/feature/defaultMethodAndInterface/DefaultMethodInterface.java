package feature.defaultMethodAndInterface;

public interface DefaultMethodInterface {

	void abstractMethod();
	default void defaultMethod(){
		System.out.println("i m default method");
	}
	
}
