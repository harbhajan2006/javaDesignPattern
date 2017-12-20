package thread;



 class B {
public synchronized void printName(){
try{
 System.out.println("printName");
Thread.sleep(1*1000);
}catch(InterruptedException e){
}
}
public synchronized void printValue(){
 System.out.println("printValue");
}
}
public class NonStaticSync extends Thread{
B b = new B();
 public static void main(String argv[]) throws Exception{
	 NonStaticSync t = new NonStaticSync();
 Thread t1 = new Thread(t,"t1");
 Thread t2 = new Thread(t,"t2");

 t2.start();
 t1.start();
 }

 public void run(){
 if(Thread.currentThread().getName().equals("t1")){
 b.printName();
 }else{
 b.printValue();
 }
 }

}
