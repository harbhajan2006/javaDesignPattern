package constructor;

class Alpha {
 static String s = " ";
 protected Alpha() { s += "alpha ";  }
 }
 class SubAlpha extends Alpha {
 private SubAlpha() { s += "sub "; }
 }
 public class Ques2 extends SubAlpha {
 private Ques2() { s += "subsub "; }
 public static void main(String[] args) {
 new Ques2();
 System.out.println(s); }
 }