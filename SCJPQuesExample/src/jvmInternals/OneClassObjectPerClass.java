package jvmInternals;

import java.util.ArrayList;

import collection.ArrayCopy;

public class OneClassObjectPerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class c1 = ArrayCopy.class;
ArrayList al = new ArrayList();
Class c2=ArrayCopy.class;

if(c1==c2){
	System.out.println("JVM creates a class object for every loade class and it is one only");
}
	}

}
