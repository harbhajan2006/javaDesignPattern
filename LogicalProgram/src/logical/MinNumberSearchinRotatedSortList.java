package logical;

public class MinNumberSearchinRotatedSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// the array is sorted but rotated
		int arr[] ={3,4,5,6,7,1,2};
		int arr1[] ={6,7,1,2,3,4,5};
		getMin(arr1);
	}

	private static int getMin(int arr[]  ){
		int min = 0;
		int startPt =0;
		int end = arr.length-1;
		int mid = startPt+end/2;
		
		if(arr[startPt]<arr[mid]){
			for(int x=mid; x<=arr.length;x++){
				if(arr[startPt]<arr[x]){
					continue;
				}else{
					min = arr[x];
					System.out.println("minimum value is " + arr[x]);
					break;
				}
			}
		}else if(arr[startPt]>arr[mid]){
			for(int x=startPt+1; x<=mid;x++){
				if(arr[startPt]<arr[x]){
					continue;
				}else{
					min = arr[x];
					System.out.println("minimum value is " + arr[x]);
					break;
				}
			}
		}
		return min;
		
	}
}
