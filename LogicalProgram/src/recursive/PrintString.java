package recursive;
// from data Structure book 5.4
public class PrintString {

	public static void main(String[] args) {
		print(0 ,"harbhajan" );
	}
	
	
	private static void print(int index, String str){
		if(str==null) System.out.println("null String");
		if(index==str.length()) return;
		else{
			System.out.println(str.charAt(index));
		print(index+1,str);
		}
	}
}
