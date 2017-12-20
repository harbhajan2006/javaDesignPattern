package thread;

public class StaticSync  extends Thread{

	
	B1 b = new B1();
	 public static void main(String argv[]) throws Exception{
		 StaticSync t = new StaticSync();
	 Thread t1 = new Thread(t,"t1");
	 Thread t2 = new Thread(t,"t2");
	 t1.start();
	 t2.start();
	 }

	 public void run(){
	 if(Thread.currentThread().getName().equals("t1")){
	 b.printName();
	 }else{
	 b.printValue();
	 }
	 } 
}


 class B1 {
public static synchronized void printName(){
try{
 System.out.println("printName");
Thread.sleep(5*1000);
}catch(InterruptedException e){
}
}
public synchronized void printValue(){
 System.out.println("printValue");
}
}