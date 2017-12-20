package overloading;

public class WrapperComparisonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i = 7;
long l = 7L;
int x = 7;

if(i.equals(x))System.out.println("case 1");
if(i==l)System.out.println("case 2");
	}

}
