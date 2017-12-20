package jvmInternals;

import java.lang.instrument.Instrumentation;

public class ObjectSize {

	 private int x;
	    private int y;
	    public static void main(String [] args) {
	        System.out.println(ObjectSizeFetcher.getObjectSize(new ObjectSize()));
	    }
}


 