package logical;
//http://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
public class FindTrailingZerosInFactorial {
	// Function to return trailing 0s in factorial of n
    static int findTrailingZeros(int n)
    {
        // Initialize result
        int count = 0;
 
        // Keep dividing n by powers of 5 and update count
        for (int i=5; n/i>=1; i *= 5)
        {	
        	System.out.println("n is " + n + " i is " + i );
             count += n/i;
             System.out.println("count  is " + count);
        }
        return count;
    }
     
    // Driver program
    public static void main (String[] args) 
    {
        int n = 75;
        System.out.println("Count of trailing 0s in "+ n +"! is "
                                    + findTrailingZeros(n));
    }
}
