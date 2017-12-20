package collection.stack;

import java.util.Arrays;

public class StackUsing3Array {

	static int stackSize=300;
	static int indexUsed=0;
	static int[] stackPointer = {-1,-1,-1};
	static StackNode[] buffer = new StackNode[stackSize*3];
	@Override
	public String toString() {
		return "StackUsing3Array [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	static int[] buffer1=new int[stackSize*3];
	
	void push(int stackNum, int value){
		int lastIndex=stackPointer[stackNum];
		stackPointer[stackNum]=indexUsed;
		indexUsed++;
		buffer[stackPointer[stackNum]]=new StackNode(lastIndex, value);
		//buffer1[stackPointer[stackNum]]=value;
		System.out.println(Arrays.toString(buffer));
		
	}
	
	int pop(int stackNum){
		int value = buffer[stackPointer[stackNum]].value;
		int lastIndex= stackPointer[stackNum];
		stackPointer[stackNum]=buffer[stackPointer[stackNum]].prev;
		buffer[lastIndex]=null;
		indexUsed--;
		return value;
	}
	static void printArray(){
		for(StackNode s : buffer){
			if(s==null)
				break;
			System.out.println("value = " + s.value + " prev = " + s.prev);
		}
	}
	public static void main(String[] args) {
		StackUsing3Array stack = new StackUsing3Array();
		stack.push(0, 1);
		stack.push(0, 2);
		stack.push(0, 3);
		stack.push(1, 11);
		stack.push(1, 12);
		stack.push(1, 13);
		stack.push(2, 21);
		stack.push(2, 22);
		stack.push(2, 23);
		printArray();
		//System.out.println(Arrays.toString(stackPointer));
		//System.out.println(indexUsed);
		//System.out.println(lastIndex);
		stack.push(0, 4);
		printArray();
		System.out.println(Arrays.toString(stackPointer));
	}
	class StackNode{
		public int prev;
		public int value;
		
		public StackNode(int p, int val){
			value=val;
			prev=p;
			
		}
		
		public String toString() {
			return "val= " + value + "prev= " + prev;
		}
		
	}
}
