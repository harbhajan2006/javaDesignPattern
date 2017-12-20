package recursive;

public class Factorial {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
System.out.println(calculate(7));
		
	}

	static long calculate(long n) throws Exception{
		if(n<0)
			throw new Exception ("negative number");
		if(n==1){
			//System.out.println(1);
			
		return 1;
		}
		else {
			n=n*calculate(n-1);
		}
		return n;
	}
}
