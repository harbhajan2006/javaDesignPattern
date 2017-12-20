package overloading;

/*1. Primitive Widening > Boxing > Varargs. 
2. Widening and Boxing (WB) not allowed. 
3. Boxing and Widening (BW) allowed. 
4. While overloading, Widening + vararg and Boxing + vararg can only be used in a mutually exclusive manner i.e. not together. 
5. Widening between wrapper classes not allowed

 Overloaded methods               Invoked by saying     Called method
doX(Integer i) & doX(long l)       doX(5)              long (by Rule 1)
doX(int...i) & doX(Integer i)      doX(5)              Integer (by Rule 1)
doX(Long l) & doX(int...i)         doX(5)              int...i (Rule 2 & 1)
doX(Long l) & doX(Integer...i)     doX(5)              Integer...i(R. 2&1)
doX(Object o) & doX(Long l)        doX(5)              Object o (Rule 2&3)
doX(Object o) & doX(int...i)       doX(5)              Object o (Rule 3&1)
doX(Object o) & doX(long l)        doX(5)              long l (Rule 3&1)
doX(long...l) & doX(Integer...i)   doX(5)              ambiguous (Rule 4)
doX(long...l) & doX(Integer i)     doX(5)              Integer (Rule 1)
doX(Long l)                        Integer i;          error (Rule 5)
                                   doX(i)
doX(Long l) & doX(long...l)        Integer i;          long...l(Rule 5 & 1)
                                   doX(i)
 
 
 
 */

public class BoxingAndWidening {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte val = 5;
		 method(val);
	}

	
	// overloaded method with refernce type
    // formal argument
    public static void method(Object b)
    {
         
        // Object b is typecasted to Byte and then printed 
        Byte bt = (Byte) b;
        System.out.println("refernce type formal argument :" + bt);
    }
}
