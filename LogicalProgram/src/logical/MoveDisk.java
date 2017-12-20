package logical;

import java.util.Stack;

//4321
//12
//4321
public class MoveDisk {
public static void main(String[] args) {
	int n=4;
	Tower tower[] = new Tower[n];
	for(int i=0;i<3;i++){
		tower[i]=new Tower(i);
	}
		for(int i=n-1;i>=0;i--){
			//System.out.println(i);
			tower[0].add(i);
		}
	
		tower[0].print();
		
		tower[0].moveDisks(n, tower[2], tower[1] , tower);
		
		tower[2].print();
}
}

class Tower{
	private Stack<Integer> disks;
	private int index;
	public Tower(int i) {
		// TODO Auto-generated constructor stub
		disks = new Stack<Integer>();
		index=i;
	}
	
	public int index(){
		return index;
	}
	
	public void add(int d){
		if(!disks.isEmpty() && disks.peek()<=d){
			System.out.println("error placing disks " + d);			
		}else
			disks.push(d);
	}
	
	public void moveTopTo(Tower t , Tower[] tower){
		int top = disks.pop();
		t.add(top);
		System.out.println();
		System.out.println("move disk " + top + " from " + (index+1)  + " to " + (t.index+1));
		System.out.print("");tower[0].print();
		System.out.print("||");tower[1].print();
		System.out.print("||");tower[2].print();
	}
	
	public void print(){
		//System.out.println("contents of tower " + index);
		for(int i=disks.size()-1; i>=0;i--){
			System.out.print( " " + disks.get(i));
		}
		//System.out.println();
	}
	
	public void moveDisks(int n, Tower destination , Tower buffer , Tower[] tower){
	
		if(n>0){
			moveDisks(n-1, buffer, destination , tower);
			moveTopTo(destination , tower);
			buffer.moveDisks(n-1, destination, this , tower);
		}
	}
}
