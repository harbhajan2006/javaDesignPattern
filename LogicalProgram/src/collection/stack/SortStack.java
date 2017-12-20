package collection.stack;

import java.util.Iterator;
import java.util.Stack;

public class SortStack {
public static void main(String[] args) {
	Stack<Integer> o  = new Stack<Integer>();
	o.push(5);
	o.push(2);
	o.push(3);
	o.push(4);
	o.push(1);
	
	Stack<Integer> t = new Stack<Integer>();
	
	while(!o.isEmpty()){
		int temp =o.pop();
		while(!t.isEmpty() && t.peek()>temp){
			o.push(t.pop());
		}
		t.push(temp);
	}
	Iterator it = t.iterator();
	while(it.hasNext()){
		
		System.out.println(it.next());
	}
}
}
