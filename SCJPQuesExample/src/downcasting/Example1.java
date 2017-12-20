package downcasting;



class Alien {
String invade(short ships) { return "a few"; }
String invade(short... ships) { return "many"; }
}
public class Example1 {
public static void main(String [] args) {
System.out.println(new Alien().invade((short)7));

int[][] a = {{1,2,}, {3,4}};
int[] b = (int[]) a[1];
Object o1 = a;
int[][] a2 = (int[][]) o1;
int[] b2 = (int[]) o1;
System.out.println(b[1]);
} }


class Dims {
 public static void main(String[] args) {
 int[][] a = {{1,2,}, {3,4}};
 int[] b = (int[]) a[1];
 Object o1 = a;
 int[][] a2 = (int[][]) o1;
 int[] b2 = (int[]) o1;
 System.out.println(b[1]);
 } }