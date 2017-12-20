package feature.lambda;
//https://www.javatpoint.com/java-lambda-expressions
//https://beginnersbook.com/2017/10/java-lambda-expressions-tutorial-with-examples/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaListLoopEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai"); 
	        
	        list.forEach((x)-> System.out.println(x));
	        
	        //Consumer c;
	        
	        List<String> list1=new ArrayList<String>();  
	          
	        //Adding Products  
	        list1.add("HP Laptop");  
	        list1.add("Keyboard");  
	        list1.add("Dell Mouse");  
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	        Collections.sort(list,(p1,p2)->{  
	        return p1.compareTo(p2);  
	        }); 
	        
	        System.out.println(list1);
	}

}
