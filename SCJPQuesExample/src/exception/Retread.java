package exception;

class MyException extends Exception { }
 class Tire {
 void doStuff() { }
 }
 public class Retread extends Tire {
 public static void main(String[] args) {
 new Retread().doStuff();
 }
 // insert code here
 	//An overriding method cannot throw checked exceptions that arebroader than those thrown by the overridden method. However an overriding method can throw
//RuntimeExceptions not thrown by the overridden method
 //void doStuff() {
	  //void doStuff() throws MyException {
	  void doStuff() throws RuntimeException {
	 //void doStuff() throws ArithmeticException {
 System.out.println(7/0);
 }
 }
