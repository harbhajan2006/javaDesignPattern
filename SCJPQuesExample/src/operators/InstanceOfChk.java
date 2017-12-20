package operators;

public class InstanceOfChk {
static Integer i = new Integer("0");
static int j ;
	public static void main(String[] args) {
		j=i;
		j=j*7;
		//System.out.println(7*i);
		// TODO Auto-generated method stub
		
		 
			 
C c2 = new D();
if(c2  instanceof B){
	System.out.println("yes");
}
		
	}

}


interface A {}
interface B{}
class C implements A{}
class D extends C implements B{};