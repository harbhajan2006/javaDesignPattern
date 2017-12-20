package DesignPattern.oo.creational;

public class Singleton {

private static Singleton SINGLETON ;

private Singleton(){
}

public static Singleton getInstance(){

if(SINGLETON==null){
	synchronized(Singleton.class){
			if(SINGLETON==null){
			SINGLETON= new Singleton();
			}
	}
}

return SINGLETON;
}
}