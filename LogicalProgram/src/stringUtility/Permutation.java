package stringUtility;

public class Permutation
{
    public static void main(String[] args)
    {
       /* way 1 geekForGeek:
        * String str = "AB";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);*/
    	
    	permutation("ABC");
    	
        //permutation.swap("ABC", 1, 2);
    }
 
    
    public static void permutation(String str) { 
        permutation("", str); 
    }

    private static void permutation(String prefix, String str) {
    	System.out.println("str value "+str);
        int n = str.length();
        if (n == 0) {
        	System.out.println(prefix + "*************************************************");
        
        }
        else {
            for (int i = 0; i < n; i++){
            	// explanation of this program given at the end of the program in comment..
            	System.out.println("value of i is  " + i + "::" + prefix + str.charAt(i) + "::" + str.substring(0, i) + str.substring(i+1, n));
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(String str, int x, int r)
    {
        if (x == r)
            System.out.println(str);
        else	
        {
            for (int i = x; i <= r; i++)
            {
                str = swap(str,x,i);
                //System.out.println("swapped value is " + str);
                permute(str, x+1, r);
                str = swap(str,x,i);
            }
        } 
    }
 
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        String a1 =String.valueOf(charArray);
        //System.out.println(a1);
        return a1;
    }
 
}





/*
str value ABC
value of i is  0::A::BC    // first char from ABC that is A i=0
str value BC
value of i is  0::AB::C
str value C
value of i is  0::ABC::
str value 

ABC*************************************************
value of i is  1::AC::B   // a bc // from the first loop string is A+BC now , so prefix is A , str is BC , i=1 first char is C , rem is B
str value B
value of i is  0::ACB::
str value 
ACB*************************************************
value of i is  1::B::AC   // second char from ABC that is B i=1
str value AC
value of i is  0::BA::C
str value C
value of i is  0::BAC::
str value 
BAC*************************************************
value of i is  1::BC::A  //b ac // from the first loop string is b+aC now , so prefix is b , str is ac , i=1 first char is C , rem is a
str value A
value of i is  0::BCA::
str value 
BCA*************************************************
value of i is  2::C::AB  // third char from ABC that is C i=2
str value AB
value of i is  0::CA::B
str value B
value of i is  0::CAB::
str value 
CAB*************************************************
value of i is  1::CB::A  //c ab // from the first loop string is c+ab now , so prefix is c , str is ab , i=1 first char is b , rem is a
str value A
value of i is  0::CBA::
str value 
CBA**************************************************/
