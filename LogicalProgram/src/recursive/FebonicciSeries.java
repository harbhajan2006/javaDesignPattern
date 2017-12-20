package recursive;

import java.util.Scanner;

public class FebonicciSeries {

	
	public static long fibonacci(long n) {
		if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
		return (n < 2) ? n : fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to print? ");
		int iter = stdIn.nextInt();
		for (int i=0;i<iter;i++) {
			System.out.print(fibonacci(i) + " ");
		}
		
		stdIn.close();
		
		printFibonacciSeries(10);

	}
	
	public static void printFibonacciSeries(int n){
		// this is without recursion
		System.out.println();
		int sum=0;
		int firstNum=0;
		int secondNum=0;
		
		for(int i=0;i<n;i++){
			
			if(i==0){
				firstNum=0;
				secondNum=0;
				
			}else if(i==1 || i==2){
				firstNum=0;
				secondNum=1;
				} else{
				firstNum=secondNum;	
				secondNum=sum;
				
				}
			
			sum= firstNum+secondNum;
			
			
			System.out.print(sum);
			
			
		}
	}
}
