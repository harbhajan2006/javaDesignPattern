package sorting;

public class InsertionSort {

	
	
/*	This is the idea behind insertion sort. Loop over positions in the array, 
	starting with index 1. Each new position is like the new card handed to you by the dealer,
	and you need to insert it into the correct place in the sorted subarray 
	to the left of that position
	
	*Another Example: 
12, 11, 13, 5, 6

Let us loop for i = 1 (second element of the array) to 5 (Size of input array)

i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12
11, 12, 13, 5, 6

i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13
11, 12, 13, 5, 6

i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
5, 11, 12, 13, 6

i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.
5, 6, 11, 12, 13


Time Complexity: O(n*n)

Auxiliary Space: O(1)

Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time (Order of n) when elements are already sorted.

Algorithmic Paradigm: Incremental Approach

Sorting In Place: Yes

Stable: Yes

Online: Yes

Uses: Insertion sort is used when number of elements is small. It can also be
 useful when input array is almost sorted, only few elements are misplaced in complete big array.
	*
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[] = {12, 11, 13, 5, 6};
int arr[] ={100,20,15,30,5,75,40};
insertionSort(arr);
ArrayUtility.printArray(arr);
	}

	
	public static void insertionSort(int arr[]){
		boolean swapNeeded = false;
		int n = arr.length;
		for(int i=1;i<n;i++){
			// 1 2 3 4 5
			int loc=0;
			swapNeeded=false;
			for (int j=i-1;j>=0;j--){
				if(arr[i]<arr[j]){
					swapNeeded=true;
					loc=j;
				}
			}
			if(swapNeeded)
				ArrayUtility.shiftArrayToRight(arr, loc, i);
		}
	}
	
	
private static void insertion_sort ( int A[ ] , int n) 
{
	//12, 11, 13, 5, 6
    for( int i = 0 ;i < n ; i++ ) {
   /*storing current element whose left side is checked for its 
            correct position .*/

     int temp = A[ i ];    
     int j = i;

      /* check whether the adjacent element in left side is greater or
           less than the current element. */

         while(  j > 0  && temp < A[ j -1]) {

          // moving the left side element to one position forward.
               A[ j ] = A[ j-1];   
               j= j - 1;

          }
        // moving current element to its  correct position.
          A[ j ] = temp;       
    }  
}
}
