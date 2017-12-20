package recursive;

public class SumOfNNumber {

	public static void main (String args[]){
		System.out.println(sum(9));
		System.out.println(sumRecursive(9));
	}
	
	private static int sum(int count){
		int sum=0;
		for(int i=1;i<=count;i++){
			sum = sum+i;
		}
		return sum;
	}
	
	
	private static int sumRecursive(int count){
		if(count<0) return 0;
		else return count+ sumRecursive(count-1);
	}
}
