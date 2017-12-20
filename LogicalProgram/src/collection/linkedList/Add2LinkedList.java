package collection.linkedList;

public class Add2LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list1 = new MyLinkedList();
		for (int i = 1; i < 4; i++) {
			list1.push(i);
		}

		MyLinkedList listToAdd = new MyLinkedList();
		listToAdd.push(5);
		listToAdd.push(5);
		listToAdd.push(5);
		
		list1.printList(list1.head);
		System.out.println();
		listToAdd.printList(listToAdd.head);
		addList(list1.head, listToAdd.head, 0);
		System.out.println("****************");
		list1.printList(list1.head);
		System.out.println();
		list1.printList(listToAdd.head);
	}

	
	static void addList(MyLinkedList.Node node1 , MyLinkedList.Node node2 ,int carry1){
		
		if(node1 == null && node2==null)
			return;
		
		int carry=carry1;
		int val = 0;
		val+=carry;
		
		if(node1!=null)
			val+=node1.data;
		
		if(node2!=null)
			val+=node2.data;
		
		if (val>10)
			{
			carry=1;
			val = val%10;
			}
		node1.data=val;
		addList(node1.next, node2.next, carry1);
	}
}
