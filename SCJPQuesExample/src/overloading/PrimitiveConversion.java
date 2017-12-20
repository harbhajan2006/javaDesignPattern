package overloading;



public class PrimitiveConversion {
public static void printValue(int i, int j, int k){
System.out.println("int");
}

public static void printValueS(short i, short j, short k){
System.out.println("int-S");
}
public static void printValue(byte...b){
System.out.println("long");
}
public static void main(String... args) {
byte b = 9;
short s =2;
printValue(b,b,b);
printValue(s,s,s);
printValueS(2,3,4);
}
}