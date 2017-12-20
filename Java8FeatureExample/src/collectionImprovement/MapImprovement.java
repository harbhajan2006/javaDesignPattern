package collectionImprovement;
//https://www.codementor.io/sureshatta/java-8-collection-api-changes-part1-map-5kdf0vjkx
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapImprovement {

	public static void main(String[] args) {
		 Map<String, String> map = new HashMap<>();
		    map.put("C", "c");
		    map.put("B", "b");
		    map.put("Z", "z");
		    
		    
		    List<Entry<String, String>> sortedByKey = 
		    		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
		    sortedByKey.forEach(System.out::println);
		    
		    
		    map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
		    
		    System.out.println(map.getOrDefault("A", "Nah!"));
		    
		    System.out.println(map.getOrDefault("B", "Nah!"));
		    
		    map.replaceAll((k, v) -> "x"); // values is "x" for all keys.
		    map.forEach((k,v)-> System.out.println(k + "---" + v));
		    
		    map.putIfAbsent("E", "harbhajan");
		    map.forEach((k,v)-> System.out.println(k + "  " + v));;
		    
		    map.compute("B", (k, v) -> v.concat(" - new "));
		    System.out.println(map.get("B")); // prints "b - new"
		    
		    //Conditional computes are also available. Look at computeIfPresent, computeIfAbsent methods.
		    
		    map.merge("B", "this is new value", (v1,v2)->v2);
		    System.out.println(map.get("B"));
		    
		    				
		    		
	}
}
