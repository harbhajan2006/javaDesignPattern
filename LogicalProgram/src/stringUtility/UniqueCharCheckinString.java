package stringUtility;

public class UniqueCharCheckinString {
 
	
	
	public static void main(String[] args) {
	
		checkUnique2("");
	}



private static boolean checkUnique(String str1){
	String str  ="harbhajan";
	boolean[] char_set = new boolean[256];
	for (int i=0;i<str.length();i++){
		int val = str.charAt(i);
		System.out.println(val);
		if(char_set[val]){
			System.out.println("false");
			return false;
		}
		char_set[val]=true;
		//return true;
}
	return true;

}

private static boolean checkUnique2(String str1){
	String str  ="harbhajan";
	int checker =0;
	for (int i=0;i<str.length();i++){
		int x='a';
		int y = str.charAt(i);
		System.out.println(x + "**" + y);
		int val = str.charAt(i)-'a';
		System.out.println(val);
		System.out.println(1<<2);
		if( ( checker & (1<<val))>0)
				return false;
		checker |=(1<<val);
		
		
}
	return false;

}



}
