package operators;

class Comp2 {
 public static void main(String[] args) {
 float f1 = 3f;
 float[][] f2 = {{40f}, {7f, 3f}, {6f, 7f}};
 float[] f3 = {7f};
 long x = 42;
 // insert code here
 double q = 42.0f;
 
 int d = 42;
 
 if(d==x)System.out.println("int equal long");
 
 if(x==q) System.out.println("hello");
 
 if(f3 == f2[2])
 System.out.println("true");
 
// if(f1==f2)
	 if(f1 == f2[2][1])
		 if(x == f2[0][0])
	//		 if(f1 == f2[1,1])
				 if(f3 == f2[2])
 System.out.println("true");
 }
 }
