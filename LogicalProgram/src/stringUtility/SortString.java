package stringUtility;

public class SortString {

static	int STANDARAD_VALUE=97;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortString("harbhajan");
	}
static void sortString(String str){
	char[] arr = str.toCharArray();
	int [] arr1 = new int[27];
	for(char c :arr){
		int val = (int)c-STANDARAD_VALUE;
		//if(arr1[val]==0)
			arr1[val]++;
			}
	
	for(int i=0;i<arr1.length;i++){
		if(arr1[i]!=0){
			System.out.println("the pos is ::" +  i + " char is  "+ (char)(i+STANDARAD_VALUE) + " repetion is + " + arr1[i]);
		}
	}
}
}
