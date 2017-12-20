package feature.stream;

import java.util.ArrayList;
import java.util.List;

public class SumStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<100;i++){
			al.add(i);
		}
		// sum of all list elements
		System.out.println(al.stream().mapToInt(i->i).sum());
		
		System.out.println(al.parallelStream().mapToInt(i->i).sum());
	
	// sum of all elements less than 10
		
		System.out.println(al.stream().filter(x->x<10).mapToInt(c->c).sum());
	}

}
