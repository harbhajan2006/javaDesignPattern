package bitManipulation;

public class CreateSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(updateBits(Integer.parseInt("1000000000", 2), 10101, 2, 6));
System.out.println(110&001);
	}

	public static int updateBits(int n , int m , int i , int j){
		
		int max=Integer.parseInt("11111", 2);
		System.out.println("max:: " + max);
		int left = max-((1<<j)-1);
		System.out.println(left);
		int right = ((1<<i)-1);
		int mask = left| right;
		return (n&mask)|(m<<i);
		
	}
}
