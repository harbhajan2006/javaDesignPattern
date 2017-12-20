package logical;

public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result s;
 s =estimate1("BRYG", "RYGB");
System.out.println(s.hits +   "-------" +s.pseudoHits);

 s =estimate1("RBYG", "RYGB");
System.out.println(s.hits +   "-------" +s.pseudoHits);


 s =estimate1("RGYB", "RYGB");
System.out.println(s.hits +   "-------" +s.pseudoHits);


 s =estimate1("RYGB", "RYGB");
System.out.println(s.hits +   "-------" +s.pseudoHits);
	}

	
	public static Result estimate(String guess, String solution) {
		 Result res = new Result();
		 int solution_mask = 0;
		 for (int i = 0; i < 4; ++i) {
			 System.out.println((1 + solution.charAt(i) - 'A'));
		 solution_mask |= 1 << (1 + solution.charAt(i) - 'A');
		 }
		 for (int i = 0; i < 4; ++i) {
		 if (guess.charAt(i) == solution.charAt(i)) {
		 ++res.hits;
		 } else if ((solution_mask &
		 (1 << (1 + guess.charAt(i) - 'A'))) >= 1) {
		 ++res.pseudoHits;
		 }
		 }
		 return res;

		}
	
	
	public static Result estimate1(String guess, String solution) {
		 Result res = new Result();
		 int solution_mask = 0;
		 /*for (int i = 0; i < 4; ++i) {
			 System.out.println((1 + solution.charAt(i) - 'A'));
		 solution_mask |= 1 << (1 + solution.charAt(i) - 'A');
		 }*/
		 for (int i = 0; i < 4; ++i) {
		 if (guess.charAt(i) == solution.charAt(i)) {
		 ++res.hits;
		 } else /*if ((solution_mask &
		 (1 << (1 + guess.charAt(i) - 'A'))) >= 1) {*/
		 ++res.pseudoHits;
		// }
		 }
		 return res;

		}
}

  class Result {
 public int hits;
 public int pseudoHits;
 }

 