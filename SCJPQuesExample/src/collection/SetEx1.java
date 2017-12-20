package collection;

import java.util.*;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet();
		set.add("2");
		//set.add("3");
		set.add(3); // this will throw RTE.
		set.add("1");
		Iterator it = set.iterator();
		while (it.hasNext())
		System.out.print(it.next() + " ");
	}

}
