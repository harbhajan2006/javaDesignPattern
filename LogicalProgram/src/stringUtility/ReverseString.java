package stringUtility;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseStringWay1("harbhajan");
	}
	//abcd->dabc->dbca-> (dcba)
	
	static void reverseStringWay1(String str){
		char arr[]= str.toCharArray();
		int arrLen = arr.length;
		//int j=0;
		for(int i=0,j=arrLen-1;i<arrLen && j>0 && i<j;){
			char temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(new String(arr));
	}

}
