package logical;

public class FindMaxNumberWithoutIfElse {
public static void main(String[] args) {
	
	/*for(int i=0;i<9;i++)
	System.out.println(i + "----" +flip(i));*/
	// 0 positive and 1 negative
	System.out.println(getMax(9, 10));
}

/* Flips 1 to 0 and vice-versa */
public static int flip(int bit){
   return 1^bit;
}


static int getMax(int a, int b) {
 int c = a - b;
 //int k = (c >> 31) & 0x1;
 int k = (c >> 31)  ;
 System.out.println(k);
 int max = a - k * c;
 return max;
 }
}
