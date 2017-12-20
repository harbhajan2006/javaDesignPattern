package generics;



import java.util.Collections;
import java.util.*;




public class GenericsEx1 {
    
	 public static void doStuff1(List<Empty> list) {
         System.out.println("a");
 }
 public static void doStuff2(List list) {        
	 System.out.println("b");
 }
 public static void doStuff3(List<? extends Empty> list) {
	 System.out.println("c");       
 }
 
 public static void main(String args[]) {
         List<Empty> list1 = new LinkedList<Empty>();
         List<Extended> list2 = new LinkedList<Extended>();
         
      doStuff2(list2);
 }
    
    
}





class Empty {   
}

class Extended extends Empty {  
}



