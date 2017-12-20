package collection.stack;

public class StackWithMinFunction extends java.util.Stack{
java.util.Stack<Integer> s2;

public StackWithMinFunction() {
	s2=new java.util.Stack<Integer>();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Integer.MAX_VALUE);
StackWithMinFunction s = new StackWithMinFunction();
s.push(5);
s.push(11);
s.push(3);
s.push(6);
s.push(8);
s.push(2);
System.out.println(s.min());

	}

	public void push(int value){
		if(value<=min()){
			s2.push(value);
		}
		super.push(value);
	}
	
	
	
	@Override
		public Integer  pop() {
			// TODO Auto-generated method stub
		int val = (int) super.pop();
		if(val==min()){
			s2.pop();
		}
		return val;
			
		}
	
	public int min(){
		if(s2.isEmpty())
			return Integer.MAX_VALUE;
		else
			return s2.peek();
	}
	
}


class NodeWithMin{
	public int val;
	public int min;
	
	public NodeWithMin(int v , int m) {
		// TODO Auto-generated constructor stub
		val=v;
		min=m;
		
	}
}