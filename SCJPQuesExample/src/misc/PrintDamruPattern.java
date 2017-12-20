/**
 * 
 */
package misc;

/**
 * @author HarbhajanKaur
 *
 */
public class PrintDamruPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int counter = 7;
		for (int i = 1; i <= 7; i++) {
			for (int k = i; k <= counter; k++) {
				if (k == i && counter != 7) {
					int j = i;
					while (j-1 > 0) {
						System.out.print(" ");
						j--;
					}
				}
				if (k <= counter) {
					System.out.print("*");
				} 
			}
			System.out.println();
			counter = counter - 2;
		}
		int len=2;

		for(int x=2;x<7;x++){

			for(int x1=0;x1<len;x1++){
				System.out.print("*");
			}
			System.out.println();
			len++;
		}
	}

}
