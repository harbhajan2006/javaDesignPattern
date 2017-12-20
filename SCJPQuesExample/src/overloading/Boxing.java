package overloading;
// when prim and boxing both avaliable then it goes for prim the
// closet match. when prim is not avaliable then automatically goes to 
// wrapper.
public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
print(2l);
	}

	static void print(Long l){
		System.out.println("wrapper long");
	}
	
	static void print(long l){
		System.out.println("prim long");
	}
	
	
	
}
