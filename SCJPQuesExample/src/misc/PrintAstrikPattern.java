/**
 * 
 */
package misc;

/**
 * @author HarbhajanKaur
 *
 */
public class PrintAstrikPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int k = i; k <= 7; k++) {
				if (k < 7) {
					System.out.print("*");
				} else if (k == 7) {
					System.out.println("*");
				}
			}
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
