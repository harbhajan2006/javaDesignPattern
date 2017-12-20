package logical;

public class NumtoWordNotation {

	String ten[] = {"one" , "two" , "three" , "four" , "five" , "six" ,
			"seven" , "eight" , "nine" , "zero"};
	static String[] wordarr1 = {"","One ", "Two", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ","Nine "};
	static String[] wordarr11 = {"", "Eleven ", "Twelve ", "Thirteen ",
			"Fourteen ", "Fifteen ", "Sixteen ",
			"Seventeen ", "Eighteen ", "Nineteen "};
	static String[] wordarr10 = {"","Ten ", "Twenty ", "Thirty ", "Forty ",
			"Fifty ", "Sixty ", "Seventy ", "Eighty ",
	"Ninety "};
	static String[] wordarr100_1 = {"", "" ,"Hundred ", "Thousand "};
	static String[] wordarr100 = {"", "" ,"Hundred ", "Thousand "};


	public static void main(String[] args) {
		System.out.println(numtostring(19876));
		//System.out.println(printWordNotation(4567));
		//System.out.println(printWordNotation(5000));
	}
	// 
	public static String printWordNotation(int num){
		StringBuilder word=new StringBuilder();
		int len = 1;
		while (Math.pow((double)10, (double)len ) < num) {
			len++;
		}


		int last2Digit=0;

		while(len>2){
			int posNum=(int) (num/Math.pow((double)10, (double)len-1));
			int rem=(int) (num%Math.pow((double)10, (double)len-1));
			num=rem;
			//System.out.println( "len :: " + len + " posNum " + posNum + " rem :: " + rem );
			word.append(wordarr1[posNum]);
			word.append(" ");
			if(posNum!=0)
				word.append(wordarr100_1[len-1]);
			last2Digit=rem;
			len--;

		}

		if(last2Digit>20){
			int firstDigit = last2Digit/10;
			word.append(" and ");
			word.append(wordarr10[firstDigit]);
			word.append(" ");
			word.append(wordarr1[(int)last2Digit%10]);
		}else{
			word.append(" and ");
			word.append(wordarr11[last2Digit-10]);
		}
		return word.toString();
	}


	public static String getWordNot(int num){
		StringBuilder sb=new StringBuilder();
		int len = 1;
		int tmp;
		while (Math.pow((double)10, (double)len ) < num) {
			len++;
		}

		if (num == 0) {
			sb.append("Zero");
		} else {
			if (len > 3 && len % 2 == 0) {
				len++;
			}
			do {
				// Number greater than 
				if (len >3 ) {
					tmp = (num / (int)Math.pow((double)10,(double)len-2));
					// If tmp is 2 digit number and not a multiple of 10
					if (tmp / 10 == 1 && tmp%10 != 0) {
						sb.append(wordarr11[tmp % 10]) ;
					} else {
						sb.append(wordarr10[tmp / 10]);
						sb.append(wordarr1[tmp % 10]);
					}
					if (tmp > 0) {
						sb.append(wordarr100[len / 2]);
					}
					num = num % (int)(Math.pow((double)10,(double)len-2));
					len = len-2;
				} else { // Number is less than 1000
					tmp = num / 100;// 999->9
					if (tmp != 0) {
						sb.append(wordarr1[tmp]);
						sb.append(wordarr100[len / 2]);
					}
					tmp = num % 100 ;//99
					if(tmp / 10 == 1 && tmp % 10 != 0) {
						sb.append(wordarr11[tmp % 10]) ;
					} else {
						sb.append(wordarr10[tmp / 10]);
						sb.append(wordarr1[tmp % 10]);
					}
					len = 0;
				}
			} while(len > 0);

			return sb.toString();

		}
		return sb.toString();
	}
	
	
	
	
	
	 public static String numtostring(int num) {
		 StringBuilder sb = new StringBuilder();
		
		 // Count number of digits in num.
		 int len = 1;
		 while (Math.pow((double)10, (double)len ) < num) {
		 len++;
		 }
		
		 String[] wordarr1 = {"","One ", "Two ", "Three ", "Four ",
		 "Five ", "Six ", "Seven ", "Eight ","Nine "};
		 String[] wordarr11 = {"", "Eleven ", "Twelve ", "Thirteen ",
		 "Fourteen ", "Fifteen ", "Sixteen ",
		 "Seventeen ", "Eighteen ", "Nineteen "};
		 String[] wordarr10 = {"","Ten ", "Twenty ", "Thirty ", "Forty ",
		 "Fifty ", "Sixty ", "Seventy ", "Eighty ",
		 "Ninety "};
		 String[] wordarr100 = {"", "Hundred ", "Thousand "};
		 int tmp;
		 if (num == 0) {
		 sb.append("Zero");
		 } else {
		 if (len > 3 && len % 2 == 0) {
		 len++;
		 }
		do {
		 // Number greater than 999
		 if (len > 3) {
		 tmp = (num / (int)Math.pow((double)10,(double)len-2));
		 // If tmp is 2 digit number and not a multiple of 10
		 if (tmp / 10 == 1 && tmp%10 != 0) {
		 sb.append(wordarr11[tmp % 10]) ;
		 } else {
		 sb.append(wordarr10[tmp / 10]);
		 sb.append(wordarr1[tmp % 10]);
		 }
		//Solutions to Chapter 19 | Moderate
		//. CareerCup com 272
		 if (tmp > 0) {
		 sb.append(wordarr100[len / 2]);
		 }
		 num = num % (int)(Math.pow((double)10,(double)len-2));
		 len = len-2;
		 } else { // Number is less than 1000
		 tmp = num / 100;
		 if (tmp != 0) {
		 sb.append(wordarr1[tmp]);
		 sb.append(wordarr100[len / 2]);
		 }
		 tmp = num % 100 ;
		 if(tmp / 10 == 1 && tmp % 10 != 0) {
		 sb.append(wordarr11[tmp % 10]) ;
		 } else {
		 sb.append(wordarr10[tmp / 10]);
		 sb.append(wordarr1[tmp % 10]);
		 }
		 len = 0;
		 }
		 } while(len > 0);
		 }
		 return sb.toString();
		 }
}
