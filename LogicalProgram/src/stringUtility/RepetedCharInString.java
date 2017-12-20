package stringUtility;

import java.awt.AlphaComposite;

public class RepetedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="noduplicate";
char arr[] = str.toCharArray();

int aplhaarr1[] = new int[26];
for(int y=0;y<arr.length;y++){
	
	
	int pos = arr[y]-(int)'a';
	//System.out.println((int)arr[y]);
	//System.out.println(pos);
	int val = aplhaarr1[pos];
	val = val+1;
	aplhaarr1[pos]=val;
	
	if(val>1)
		System.out.println("duplicate char");
	
}

for(int i=0;i<aplhaarr1.length;i++)
	System.out.print(aplhaarr1[i] + " ");
	}

}
