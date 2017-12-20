package array;

import sorting.ArrayUtility;

public class CompareAndSortArray {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// pre cond:: both arrays are sorted in asc order..
		// 
		
		int arr1[] ={5,6,7};
		int arr2[] ={3,4,9,12};
		
		int len1=arr1.length;
		int len2 =arr2.length;
		int arr[] = new int[len1+len2];
		int i=0, j=0 , k=0;
		while(i<len1 && j<len2){
			
			if(arr1[i]<arr2[j]){
				arr[k]=arr1[i];
				i++;
			}else{
				arr[k]=arr2[j];
				j++;
			}
			k++;
			
		}
		System.out.println(i + "------ " + j);
		ArrayUtility.printArray(arr);
		
		// copy remainig array
		
		while(i<len1){
			arr[k]=arr1[i];
			i++;	
		}
		while(j<len2){
			arr[k]=arr2[j];
			j++;
			k++;
		}
		System.out.println();
		ArrayUtility.printArray(arr);
		divideArray(arr, 0, arr.length);
	}

	
	public static void divideArray(int arr[] , int l, int r ){
		count++;
		//System.out.println("value of l and r is " + l + "--" + r + "--");
        if (l < r)
        {
        	
            // Find the middle point
            int m = (l+r)/2;
            System.out.println();
            System.out.println("count:" + count + " left :: " + l + " right :: " + r);
            System.out.println("*********************************");
            ArrayUtility.printArray(arr,l,r);
            // Sort first and second halves
            divideArray(arr, l, m );//0-5,0-2,0-1,0-0
            
            divideArray(arr , m+1, r );//1-1,
            
           
        }
		
	}
		
	}
