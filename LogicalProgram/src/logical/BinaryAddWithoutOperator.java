package logical;

public class BinaryAddWithoutOperator {
public static void main(String[] args) {
	System.out.println(add_no_arithm(2, 2));
}


static int add_no_arithm(int a, int b) {
	 if (b == 0) return a;
	 int sum = a ^ b; // add without carrying
	int and =(a&b);
	 int carry = and << 1; // carry, but don’t add
	 System.out.println(sum + "---" + carry + "---" + and); 
	 return add_no_arithm(sum, carry); // recurse
	 }
}
