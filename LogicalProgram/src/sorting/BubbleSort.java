package sorting;


/*Complexity:
Best case: O(n) -- when array is already sorted.
Average case: O(nˆ2)
Worst case: O(nˆ2)
n^2 beccause it has 2 nested loops.n*n = n^2
http://www.java2blog.com/2015/12/implement-bubble-sort-in-java.html
http://www.geeksforgeeks.org/bubble-sort/
http://www.baeldung.com/java-bubble-sort
https://mathbits.com/MathBits/Java/arrays/Bubble.htm
Bubble Sort is the simplest sorting algorithm 
that works by repeatedly swapping the adjacent elements if they are in wrong order.
*/

public class BubbleSort {
	static boolean swapped = false;
	public static void main(String[] args) {
		int arr[] ={100,20,15,30,5,75,40};
		bubbleSort(arr);

	}

	private static void bubbleSort(int []arr){
		
		int n= arr.length-1;
		for(int i=0;i<n;i++){
			swapped=false;
			for (int j=0;j<n-i;j++){
				swapIfNeeded(arr, j, j+1 );
			}
			
			if(!swapped){
				System.out.println("swap true");
				break;
			}
		}
		
		printArray(arr);
	}

	private static void printArray(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	private static void swapIfNeeded (int arr[] , int left, int right ){
		int temp=0;
		if(arr[left]>arr[right])
		{
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			// this line of code is further added for fast performace and nothing to do with logic , 
			//we can remove this we well
			swapped=true;
		}

	}
	
	
	private static void bubbleSort1(int []arr){
		int n= arr.length;
		for(int i=0;i<n;i++){
			for (int j=0;j<n-1;j++){
				swapIfNeeded(arr, j, j+1);
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}
}