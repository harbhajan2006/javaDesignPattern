package sorting;

/*
Time Complexity: O(n2) as there are two nested loops.

Auxiliary Space: O(1)
The good thing about selection sort is
it never makes more than O(n) swaps and can be useful when memory write is a costly operation.

*The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.

Following example explains the above steps:

arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
11 12 22 25 64 
*
*/
public class SelectionSort{
	// https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/tutorial/
	
	public static void main(String[] args) {
		
	
		/*int arr[];
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			arr[]=sc.nextInt();
		}*/

		int arr[] = {64, 25, 12, 22, 11};
		selectionSort(arr);
		ArrayUtility.printArray(arr);
	
	}

	private static void selectionSort(int[] arr){

		int n = arr.length;
		int loc;
		// 5 4 6 3 2 
		for(int i=0;i<n; i++){
			loc=i;
			for(int j=i+1;j<n ;j++){
				if(arr[j]<arr[loc]){
					// swap data
					//arr[i]=arr[j];
					loc=j;
				}
			}
			ArrayUtility.swapIfNeeded(arr, i, loc);
			//arr[i]=arr[loc];
		}


	}


}
