package feature.stream;

import java.util.Arrays;
import java.util.List;

public class StreamOpearations {
public static void main(String[] args) {

	List<String> ls =  Arrays.asList("a" ,"b" , "b1" , "b3" ,"c1");
	ls.stream().filter(s->s.startsWith("b"))
	.forEach(System.out::println);
	
	
	ls.stream().filter(s->s.startsWith("b"))
	.map(s->s.toUpperCase())
	.sorted()
	.forEach(System.out::println);
	
}
	
	
}
