package downcasting;

import java.util.ArrayList;
import java.util.List;

public class Downcast {
	public static void main(String[] args) {
		 new Redwood().go();
		 }
}

  class Redwood extends Tree {
	  List l ;
 void go() {
 //go2(new Tree(), new Redwood());
 go2((Redwood) new Tree(), new Redwood());
 }
 void go2(Tree t, Redwood r) {
	
	
	 // this is downcasting --> we are casting tree to redwood
 Redwood r2 = (Redwood)t;
 
 // this is upcasting -- > we are cacsting redwood to Tree
 Tree t2 = (Tree)r;
 }
 }
 class Tree { }
