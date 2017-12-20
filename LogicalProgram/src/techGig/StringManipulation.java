package techGig;

import java.util.Scanner;


// abcde -- ab_de
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter stringn");
		//String input1 = s.nextLine();
		System.out.println(changeData("harbhajan"));// cbdae
		System.out.println(original("hbarjaahn"));// cbdae
		
	}

	
	private static String original(String input1){
		int len=input1.length();
		int middle = len/2;
		int loc=1;
		char[] original= new char[len];
		original[middle]=input1.charAt(0);
		for(int i=1;i<len;i+=2){
			original[middle-loc]=input1.charAt(i);
			original[middle+loc]=input1.charAt(i+1);
		loc++;
			
		}
		
		return new String(original);
	}
	
	private static String changeData(String input1){
		
		if (input1==null) return "";
		
		char dataArr[] = input1.toCharArray();
		
		int len = dataArr.length;
		char newDataArr[]= new char[len];
		if(len==1) return input1;
		int cnt=0;
		while(len!=0){
			
			int index=getPos(len);
			newDataArr[cnt]=dataArr[index];
			shiftCharArrToLeft(dataArr,index);
			len--;
			cnt++;
		}
		
		return new String(newDataArr);
	}
	
	private static void shiftCharArrToLeft(char[] dataArr , int pos){
		char temp = dataArr[pos];
		for(int i= pos; i<dataArr.length-1;i++){
			dataArr[i]=dataArr[i+1];
		}
	}
	private static int getPos(int stringLength){
		int pos=0;
		if(stringLength%2==0){
			pos=stringLength/2-1;
		}else{
			pos=stringLength/2;
		}
		return pos;
	}
}
