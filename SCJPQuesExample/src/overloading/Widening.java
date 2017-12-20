package overloading;


//If compiler fails to find any method corresponding to autoboxing, then it starts searching a method
//parameter(s) of the widened primitive data type.
public class Widening {
//byte>short>int>long
//float>double
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long b=7;
print(b);
	}

	
	static void  print(byte b){
		System.out.println("byte");
	}
	/*static	void print(short b){
		System.out.println("short");
	}*/
	static void print(int b){
		System.out.println("int");
	}
	/*static void print(long b){
		System.out.println("long");
	}*/
	static void print(float b){
		System.out.println("float");
	}
	static void print(double b){
		System.out.println("double");
	}
	
}
