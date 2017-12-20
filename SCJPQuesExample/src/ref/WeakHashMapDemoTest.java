package ref;
import java.util.*;

class HashMapDemo
{
    public  void main1(String args[])throws Exception
    {
        HashMap m = new HashMap();
        Demo d = new Demo();
         
        // puts an entry into HashMap
        m.put(d," Hi "); 
         
        System.out.println(m); 
        d = null;
         
        // garbage collector is called
        System.gc();
         
        //thread sleeps for 4 sec
        Thread.sleep(4000); 
         
        System.out.println(m);
        }
    }
class WeakHashMapDemo
{
    public  void main1(String args[])throws Exception
    {
        WeakHashMap m = new WeakHashMap();
        Demo d = new Demo();
         
        // puts an entry into WeakHashMap
        m.put(d," Hi "); 
        System.out.println(m);
         
        d = null;
         
        // garbage collector is called
        System.gc(); 
         
        // thread sleeps for 4 sec
        Thread.sleep(4000); 
         
        System.out.println(m);
    }
}
 
class Demo
{
    public String toString()
    {
        return "demo";
    }
     
   /* // finalize method
    public void finalize()
    {
        System.out.println("finalize method is called");
    }*/
}

public class WeakHashMapDemoTest{
	public static void main(String[] args) throws Exception {
		HashMapDemo hDemo = new HashMapDemo();
		hDemo.main1(null);
		WeakHashMapDemo wdemo = new WeakHashMapDemo();
		wdemo.main1(null);
	}
}