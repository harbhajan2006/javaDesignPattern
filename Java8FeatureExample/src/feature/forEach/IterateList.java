package feature.forEach;
//https://beginnersbook.com/2017/10/java-8-foreach/
import java.util.ArrayList;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al = new ArrayList<String>();
al.add("hk");
al.add("cj");
al.add("hk-cj");

al.forEach(str->{System.out.println(str);});

al.forEach(System.out::println);

	}

}
