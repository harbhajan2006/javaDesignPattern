package regex;

public class RegexOnNumber {
// single digit [0-9]
	// contains only number , no decimal [0-9]+
	// contains number , can be decimal
	// https://regexone.com/lesson/letters_and_digits
	public static void main(String[] args) {
		
		System.out.println(isNumber("2"));
		System.out.println(isNumber("21"));
		System.out.println(isDecimalNumber("2111"));
		System.out.println(isDecimalNumber("2.789"));
	}
	
	
	
	
	static boolean isNumber(String s){
		return s.matches("[0-9]+");
	}
	
	
	static boolean isDecimalNumber(String s){
		return s.matches("[0-9]+\\.[0-9]+");
	}
}
