package collection;

public class MyCollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyArrayList ml = new MyArrayList();

for(int i=0;i<28;i++){
	ml.add(i);
}


System.out.println(ml);

ml.remove(new Integer(3));

	System.out.println(ml);
	}

}
