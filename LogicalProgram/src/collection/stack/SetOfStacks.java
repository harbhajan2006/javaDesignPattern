package collection.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;



public class SetOfStacks {
	
	 boolean capacityReached=false;
	 int capacityCounter=0;
	public static void main(String[] args) {
		java.util.Stack stack;
		SetOfStacks stackList = new SetOfStacks(2);
		for(int i=1;i<=8;i++){
			stackList.push(i);
		}
		//System.out.println(stackList.pop());
		System.out.println(stackList.stacks.size());
		stackList.printSetOfStacks();
		System.out.println(stackList.popAt(1));;
		stackList.printSetOfStacks();
	}
	
	ArrayList<MyStack> stacks = new ArrayList();
	public int capacity;
	public SetOfStacks(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
	}
	
	public MyStack getLastStack(){
		if(stacks.size()==0)
			return null;
		return stacks.get(stacks.size()-1);
		
	}

	public void push(int v){
		Stack last = getLastStack();
		if(last !=null && !capacityReached){
			last.push(v);
			
			capacityCounter++;
			if(capacityCounter==capacity){
				capacityReached=true;
				capacityCounter=0;
			}
		}else{
			System.out.println("creating new stack");
			MyStack s = new MyStack(capacity);
			s.push(v);
			capacityCounter++;
			capacityReached=false;
			stacks.add(s);
			
		}
		
	}
	
	public int pop(){
		MyStack last = getLastStack();
		int val = (int) last.pop();
		if(last.isEmpty()){
			stacks.remove(stacks.size()-1);
		}
		return val;
	}
	
	public int popAt(int index){
		return leftShift(index,true);
	}
	
	public int leftShift(int index , boolean flag){
		MyStack ms= stacks.get(index);
		int val = (int) ms.pop();
		int temp=0;
		//0123
		while(index<3){
			MyStack currentStack = stacks.get(index);
			MyStack nextStack = stacks.get(index+1);
			temp=(int)nextStack.pop();
			System.out.println("poping " + temp + "from " + (index+1) + " stack");
			currentStack.push(temp);
			index++;
		}
		// get a value from pop - index+1 and push that to index
		// do until counter == capacity
		return val;
		
	}
	
public void	printSetOfStacks(){
	int i=0;
		for(MyStack ms : stacks){
			System.out.println("substack " +  ++i);
		Iterator it=	ms.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
	}
}

class MyStack extends Stack{
	
	

	public MyStack(int capacity) {
		// TODO Auto-generated constructor stub
	}
	
}