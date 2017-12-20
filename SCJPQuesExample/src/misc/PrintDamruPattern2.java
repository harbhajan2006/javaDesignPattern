package misc;

public class PrintDamruPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 10;

		for (int i = len; i >= 0; i -= 2) {
			
			if(i==0){
				System.out.print("*");
			}
			
			
			for (int space = 0; space < (len - i)/2; space++) {
				System.out.print(" ");
			}

			if(i==0){
				System.out.print("*");
			}
			for (int k = 0; k <i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//System.out.println("");
	}

}
