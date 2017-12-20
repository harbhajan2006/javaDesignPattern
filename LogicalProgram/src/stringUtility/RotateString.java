package stringUtility;

public class RotateString {

	public static void main(String[] args) {
		char charArr[]="apple".toCharArray();
		char charArr1[]="apple".toCharArray();
		leftRotate(charArr, 5, charArr.length);
		rightRotate(charArr1, 5, charArr.length);
	}
	
	static void rotateString(String str , int num){
		leftRotatebyOne(str.toCharArray(), str.length());
	}
	
	
	 static void leftRotate(char arr[], int d, int n) 
	    {
	        int i;
	        
	        for (i = 0; i < d; i++)
	            leftRotatebyOne(arr, n);
	    }
	 
	 
	 static void rightRotate(char arr[], int d, int n) 
	    {
	        int i;
	        for (i = 0; i < d; i++)
	            rightRotatebyOne(arr, n);
	    }
	 
	 
	 
	static void leftRotatebyOne(char arr[], int n) 
	{
		int i;
		char temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			{
			arr[i] = arr[i + 1];
			}
		
		arr[i] = temp;
		
		System.out.println("geek-" + new String(arr));
	}
	
	
	static void rightRotatebyOne(char arr[], int n) 
	{
		int i;
		char temp;
		temp = arr[n-1];
		for (i = n-1; i >0; i--)
			{
			arr[i] = arr[i - 1];
			}
		
		arr[i] = temp;
		
		System.out.println("geek-" + new String(arr));
	}
}