package overloading;
//http://www.geeksforgeeks.org/method-overloading-autoboxing-widening-java/
import java.lang.reflect.Method;
// widening and boxingn is not possible.
public class WideningAndBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte val = 5;
		 method(val);
	}

	
	// overloaded method with refernce type formal argument
    static void method(Integer a)
    {
         
        System.out.println("Primitive type byte formal argument :" + a);
    }
}
