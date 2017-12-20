package generics;

public class GenericType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	//Java Generic Method
		public static <T> boolean isEqual(GenericType<T> g1, GenericType<T> g2){
			return g1.get().equals(g2.get());
		}
		
		//Java Generic Method
				public static <T> boolean isEqualGeneric2(T g1, T g2){
					return g1.equals(g2);
				}
		
	public static void main(String args[]){
		GenericType<String> type = new GenericType<>();
		type.set("Pankaj"); //valid
		// when no parameter is specified it is called
		// raw type , it is old one and can take any OBJECT.
		// we can have generic interface too , Comparable is est exampe of
		// generic intnerface in java.
		GenericType type1 = new GenericType(); //raw type
		type1.set("Pankaj"); //valid
		type1.set(10); //valid and autoboxing support
		
		
		GenericType<String> g1 = new GenericType<>();
		g1.set("Pankaj");
		
		GenericType<String> g2 = new GenericType<>();
		g2.set("Pankaj");
		
		boolean isEqual = GenericType.<String>isEqual(g1, g2);
		//above statement can be written simply as
		isEqual = GenericType.isEqual(g1, g2);
		//This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
		//Compiler will infer the type that is needed
		System.out.println(isEqualGeneric2(g1, g2));
		System.out.println(isEqualGeneric2("hk", "hk"));
	}
}
