package string;

public class ReverseString{

public static void main (String args[]){

String str ="abcd";
String reverseString="";
int len = str.length();
for(int i=len;i>0;i--){
reverseString=reverseString+str.charAt(i-1);

}
System.out.println(reverseString);

}



}