package feature.defaultMethodAndInterface;

public interface StaticAndDefaultMethod {

	static void staticMethod(){
		System.out.println("static method");
	}
	
	static void staticMethod1(){
		System.out.println("static method");
	}
	
	
	default void defaultMethod(){
		System.out.println("static method");
	}
	
	
	default void defaultMethod2(){
		System.out.println("static method");
	}
	
	
	void abstractMethod();
}
