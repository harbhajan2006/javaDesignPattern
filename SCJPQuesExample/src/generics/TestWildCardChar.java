package generics;
import java.lang.ref.WeakReference;
import java.util.*;
public class TestWildCardChar {

public static void main(String[] args) {
	Thread t;
List<Integer> myList = new ArrayList<Integer>();
Bar bar = new Bar();
bar.doInsert(myList);
WeakHashMap wm;
WeakReference wr;
}
}
class Bar {
void doInsert(List< ? extends Integer> list) {
list.add(new Dog());
}
}