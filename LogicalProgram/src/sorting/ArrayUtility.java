package sorting;

public class ArrayUtility {

	
	public static void printArray(int arr[])
{
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
}

	
	public static void printArray(int arr[] , int start , int end)
	{
		if(end==arr.length)
			end = end-1;
		
			for(int i=start;i<=end;i++){
				System.out.print(arr[i] + " ");
			}
	}
	
	public static void swapIfNeeded (int arr[] , int left, int right ){
		int temp=0;
		if(arr[left]>arr[right])
		{
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			// this line of code is further added for fast performace and nothing to do with logic , 
			//we can remove this we well
			
		}

	}
	
	//[5, 11, 12, 13, 6] --> [5,6,11,12,13]
	public static void shiftArrayToRight(int[] arr , int shiftIndex , int actualElementIndex){
		int actualElement = arr[actualElementIndex]; //6
		for(int i = actualElementIndex ; i>shiftIndex ;i--){ //1
			//if(i-1==shiftIndex) break;
			arr[i]=arr[i-1]; // 4->3 , 3->2, 2->1
		}
		arr[shiftIndex]=actualElement;
	}

	public static void main(String[] args) {
		int arr[] = {5,11,12,13,6};
		shiftArrayToRight(arr,1,4);
		printArray(arr);
		
	}
}
