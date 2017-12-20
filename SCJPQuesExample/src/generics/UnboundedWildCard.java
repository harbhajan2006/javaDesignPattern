package generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCard {

	public static void main(String[] args) {
		List al = new ArrayList();
		List<? extends Object> wal = new ArrayList();
		
		al.add("string");
		al.add(42);
		
		
		wal.add("string");
		wal.add(42);
	}
	
}
