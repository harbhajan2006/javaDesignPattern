package logical;

public class SwapIntegers {

	public static void main(String[] args) {
		swap2(2,4);
	}
	
	static void swap1(int a , int b){
		System.out.println( a + " ** " + b);
		//9, 5->4,5>4,1>5
		a = b-a;
		System.out.println( a + " ** " + b);
		b = b-a;
		System.out.println( a + " ** " + b);
		a=	a+b;
		System.out.println( a + " ** " + b);
	}
	
	
	static void swap2(int a , int b){
		System.out.println( a + " ** " + b);
		//9, 5->4,5>4,1>5
		a = a^b;
		System.out.println( a + " ** " + b);
		b = a^b;
		System.out.println( a + " ** " + b);
		a=	a^b;
		System.out.println( a + " ** " + b);
	}
}

