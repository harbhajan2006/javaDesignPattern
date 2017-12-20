package feature.lambda;

public class LambdaEx2 {

	// // assign lambda to a interface reference
	
	public static void main(String[] args) {
		
		
		TestLambda testLambda= message1 -> System.out.println("Welcome to lambda " + message1);
		testLambda.printName("HK");
		//testLambda.printName("Harbhajan");
		
		//Integer c = (a,b)->a+b;
		
		NoParameterMethod nm = ()->{return "hello this is no param method";};
		System.out.println(nm.say());
		
		
	
	}
	
	
}

@FunctionalInterface
interface TestLambda{
	
public void 	printName(String message);
}


interface NoParameterMethod{  
    public String say();  
}  