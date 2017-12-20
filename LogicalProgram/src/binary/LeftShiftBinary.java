package binary;
// each left shift equals to multiply by 2
public class LeftShiftBinary {
public static void main(String[] args) {
	
	for(int i=1;i<=10;i++){
		System.out.println(i << 1);
	}
	// 0000 0100-> 0000 1000
System.out.println("---------------");

for(int i=20;i>=1;i=i-2){
	System.out.println(i >> 1);
}
}
}