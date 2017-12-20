package logical;
// this is incorrect
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class StrPermCalculator {
	
	
	static Set<String>  uniquePermutationSet = new HashSet();
	static CopyOnWriteArrayList<String>  uniquePermutationSetTemp = new CopyOnWriteArrayList();
public static void main(String[] args) {

	printAllPermutations(new StringBuilder("abc"));
	System.out.println(uniquePermutationSet);
}

private static void printAllPermutations(StringBuilder str){
	
	
	// run a loop to new character + merger string
	
	for(int i=0;i<str.length();i++){
		
		char c = str.charAt(i);
		StringBuilder remaningStr = str.deleteCharAt(i);
		System.out.println( c+"" + " rem is " + remaningStr);
		merge(c, remaningStr.toString());
		str=new StringBuilder("abc");
		
	}
	
	/*for(int i=0;i<strArr.length;i++){
		if (i==0){
			merge(strArr[i] , strArr[i+1]+"");
			continue;
		}
		
		Iterator it = uniquePermutationSetTemp.iterator();
		//merge(strArr[i] , mergeStr);
		while(it.hasNext()){
			merge(strArr[i+1],(String)it.next());
		}
		
		uniquePermutationSetTemp.clear();*/
	}
	
	


private static List merge(char c , String s){
	String charToS = c+"";
	int strLength = s.length();
	int totalLen = charToS.length()+strLength;
	for(int l=0;l<totalLen;l++){
		uniquePermutationSetTemp.add(new StringBuffer(s).insert(l, charToS).toString());
		//uniquePermutationSet.add(new StringBuffer(s).insert(l, charToS).toString());
	}
	uniquePermutationSet.addAll(uniquePermutationSetTemp);	
	return uniquePermutationSetTemp;
}
}
