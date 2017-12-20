package collection;

import java.util.ArrayList;
import java.util.List;

public class ListNullTest {

	
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		
		Object obj[] = {};
		System.out.println(obj.length);
		al.add("test1");
		al.add("test2");
		al.add("test3");
		al.add("test4");
		System.out.println(al.set(0, "harbhajan"));
		al.add(null);
		al.add(null);
		//al.ite
		System.out.println(al.size());
	}
	
}
