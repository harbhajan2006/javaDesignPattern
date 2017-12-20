package innerClass;

import java.util.Collections;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


class Util {
    public enum State{ACTIVE, DELETED, INACTIVE}
}

public class HashTest {
	
    public static void main(String args[]) throws Exception {
    	
    	Hotel h = new SuperHotel();
        h.book();
        
        
        String str = "null";
        if (str == null) {
                System.out.print("1");
        } else if (str.length() == 0) {
                System.out.print("2");
        } else {
                System.out.print("3");
        }
}
    }




class Hotel {
    public void book() throws Exception {
        throw new Exception();
    }
}

 class SuperHotel extends Hotel  {
    public void book() {
        System.out.print("booked");
    }
    }








