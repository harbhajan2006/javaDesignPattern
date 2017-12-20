package stringUtility;
// 3rd way is incorrect
//4 is in cracking interiew book
import java.util.Arrays;

public class AnagramString {
public static void main(String[] args) {
	//System.out.println(isAnagramWay1("HARBHAJAN", "CHARANJIT"));
	//System.out.println(isAnagramWay2("HARBHAJAN", "CHARANJIT"));
	System.out.println(isAnagramWay4("HARBHAJAN", "HARJANBHA"));
	
	}


static boolean  isAnagramWay1(String s1 , String s2){
	s1=s1.replaceAll("\\s", "");
	s2=s2.replaceAll("\\s", "");
	if(s1.length()!=s2.length())return false;
	char [] s1Arr=s1.toLowerCase().toCharArray();
	char [] s2Arr=s2.toLowerCase().toCharArray();
	Arrays.sort(s1Arr);
	Arrays.sort(s2Arr);
	if(Arrays.equals(s1Arr, s2Arr))
		return true;
	else
	return false;
	
}


static boolean  isAnagramWay2(String s1 , String s2){
	s1=s1.replaceAll("\\s", "");
	s2=s2.replaceAll("\\s", "");
	if(s1.length()!=s2.length())return false;
	char [] s1Arr=s1.toLowerCase().toCharArray();
	char [] s2Arr=s2.toLowerCase().toCharArray();
	s2=s2.toLowerCase();
	for(int i=0;i<s1Arr.length;i++){
		int idx =s2.indexOf(s1Arr[i]);
		if(idx!=-1){
			
		s2=s2.substring(0,idx)	+ s2.substring(idx+1,s2.length());
		}else{
			return false;
		}
		
	}
	
	if(s2.length()==0)
		return true;
	else
		return false;
}


static boolean  isAnagramWay3(String s1 , String s2){
	s1=s1.replaceAll("\\s", "");
	s2=s2.replaceAll("\\s", "");
	if(s1.length()!=s2.length())return false;
	char [] s1Arr=s1.toLowerCase().toCharArray();
	char [] s2Arr=s2.toLowerCase().toCharArray();
	
	int sum1=0;
	int sum2=0;
	for(char c: s1Arr){
		sum1=sum1+c;
	}
	
	for(char c: s2Arr){
		sum2=sum2+c;
	}
	System.out.println(sum1);
	System.out.println(sum2);
	if(sum2==sum1)
		return true;
	else
		return false;
}


static boolean  isAnagramWay4(String s1 , String s2){
	s1=s1.replaceAll("\\s", "");
	s2=s2.replaceAll("\\s", "");
	int num_unique_char=0;
	int num_completed_t=0;
	if(s1.length()!=s2.length())return false;
	int [] letters = new int[256];
	char[] s_array=s1.toLowerCase().toCharArray();
	for(char c :s_array){
		//System.out.println((int)c);
		if(letters[c]==0)
			++num_unique_char;
		++letters[c];
	}
	System.out.println(num_unique_char);
	s2=s2.toLowerCase();
	for(int i=0;i<s2.length();i++){
		int c = (int)s2.charAt(i);
		if(letters[c]==0){
			return false;
		}
		--letters[c];
		if(letters[c]==0){
			++num_completed_t;
			System.out.println(num_completed_t);
			if(num_completed_t==num_unique_char){
				return i==s2.length()-1;
			}
		}
	}
	return false;
}
}
