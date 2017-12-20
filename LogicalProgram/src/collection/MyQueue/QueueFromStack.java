package collection.MyQueue;

import java.util.Stack;

public class QueueFromStack {

	Stack s1,s2;
	
	public QueueFromStack() {
	
		s1=new Stack();
		s2=new Stack();
	}
	
	public int size(){
		return s1.size()+s2.size();
	}
	
	public void add(int val){
		s1.push((int)val);
	}
	
	public int peek(){
		if(!s2.isEmpty()) return (int)s2.peek();
		while(!s1.isEmpty()){
			s2.push(s1.pop());
			
		}
		return (int)s2.peek();
	}
	
	public int remove(){
		if(!s2.isEmpty()) return (int)s2.pop();
		while(!s1.isEmpty()){
			s2.push(s1.pop());
			
		}
		return (int)s2.pop();
	}
	

	public static void main(String[] args) {
		QueueFromStack qs = new QueueFromStack();
		for(int k=0;k<10;k++)
	{
			System.out.print(k);
			qs.add(k);
	}
	
		
		//qs.print();
		for(int i=0;i<5;i++)
			System.out.println((int)qs.remove());;
		
		
	}
}
