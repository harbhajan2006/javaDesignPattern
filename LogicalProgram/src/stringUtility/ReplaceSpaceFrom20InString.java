package stringUtility;

import java.util.Arrays;

public class ReplaceSpaceFrom20InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replace("a bc d er" , ' ' , "%20");
	}
	//a b = 3 , a%20b = 5 // numberOfSpaces*2+original len
	//a b c = 5, a%20b%20c = 5 // numberOfSpaces*2+original len (2*2+5=9)

	static void  replace(String str , char searchable , String replacement){
		char arr[] = str.toCharArray();
		int len = str.length();
		int spaceCnt=0;
		int replacementLen = replacement.length();
		char space=' ';
		for(char c:arr){
			if(c==space){
				spaceCnt++;
			}
		}
		//a bc d er
		int newLength = spaceCnt*2+arr.length;
		char newArr[] = new char[newLength];
		int k=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==space){
				newArr[k]='%';
				newArr[k+1]='2';
				newArr[k+2]='0';
				k=k+3;
			}else{
				newArr[k]=arr[i];
				k++;
			}
		}
		String str1= new String(newArr);
		System.out.println(str1);//Arrays.toString(newArr));
	}
}
