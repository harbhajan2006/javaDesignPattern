package collection;

import java.util.*;
class MapEQ {
public static void main(String[] args) {
Map<ToDos, String> m = new HashMap<ToDos, String>();
ToDos t1 = new ToDos("Monday");
ToDos t2 = new ToDos("Monday");
ToDos t3 = new ToDos("Tuesday");
m.put(t1, "doLaundry");
m.put(t2, "payBills");
m.put(t3, "cleanAttic");
System.out.println(m.size());
} }
class ToDos{
String day;
ToDos(String d) { day = d; }
public boolean equals(Object o) {
return ((ToDos)o).day == this.day;
}
/*If hashCode() is not overridden then every entry will go into its own
bucket, and the overridden equals() method will have no effect on determining equivalency.
If hashCode() is overridden, then the overridden equals() method will view t1 and
t2 as duplicates.*/
// public int hashCode() { return 9; }
}
