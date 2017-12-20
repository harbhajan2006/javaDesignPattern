package logical;
/*Assume u have method issubStringn(s1,s2) which tells if one word is substring
 * of another , Using only one call write a program to say is s1 and s2 are roration of each other or not
 * like watterbottle and erbottlewat*/
public class CheckStringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="watterbottle";
		String str2="erbottlewat";
		if(str.length()!=str2.length()){
			System.out.println("NO");
		}
		
		str = str+str;
		System.out.println(str);
		if(str.contains(str2)){
			System.out.println("true");
		}
	}

}
