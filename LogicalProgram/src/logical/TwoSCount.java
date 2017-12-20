package logical;

public class TwoSCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(count2SR(29));

/* 1 2 3 4 5 6  7 8 9 10
 * 11 12 13 14 15 16 17 18 19 20
 * 21 22 23 24 25 26 27 28 29
 * */
	}

	public  static int count2SR(int n){
		if(n==0)return 0;
		int power=1;
		while(10*power<n)power*=10;
		int first = n/power;
		int remainder = n%power;
		// count 2s from first digit
		int nTwosFirst =0;
		if(first>2)nTwosFirst+=power;
		else if(first==2) nTwosFirst+=remainder+1;
		
		// count 2 from othere digit
		int nTwosOther = first * count2SR(power - 1) + count2SR(remainder);
		return nTwosFirst+nTwosOther;
		
		//return 0;
	}
}
