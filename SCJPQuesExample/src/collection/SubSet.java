package collection;

import java.util.TreeSet;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s = new TreeSet<String>();
		TreeSet<String> subs = new TreeSet<String>();
		 s.add("a"); s.add("b"); s.add("c"); s.add("d"); s.add("e");
		s.stream().forEach(System.out::println);
		 subs = (TreeSet)s.subSet("b", true, "d", true);
		 s.add("g");
		 s.pollFirst();
		 s.pollFirst();
		 s.add("c2");
		 System.out.println(s.size() +" "+ subs.size());
	}

}
