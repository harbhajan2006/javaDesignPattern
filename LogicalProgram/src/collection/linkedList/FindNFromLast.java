package collection.linkedList;

public class FindNFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		for (int i = 1; i < 9; i++) {
			list.push(i);
		}

		list.printList(list.head);
		System.out.println();
		//findNthNodeFromLast(3, list);
		/*for(int i=1;i<5;i++){
			System.out.println("************* N is " + i + "**********************");
			findNthNodeFromLast(i, list);
			findNthNodeFromLastCC(i, list);
		}*/
		findNthNodeFromLastCC(3, list);
	}

	static MyLinkedList.Node findNthNodeFromLast(int n , MyLinkedList list){
		MyLinkedList.Node node = list.head;
		int count=0;
		int size=0;
		while(node!=null){
 			size++;
			node=node.next;
		}
		
		node=list.head;
//
		for(int i=1;i<size-n+1;i++){
			node = node.next;
		}

		System.out.println("output from geek :: " + node.data);
		return node;
	}


	static MyLinkedList.Node findNthNodeFromLastCC(int n , MyLinkedList list){
		MyLinkedList.Node p1 = list.head;
		MyLinkedList.Node p2 = list.head;

		for(int j=0;j<n-1;++j){
			if(p2==null){
				return null;
			}

			p2=p2.next;
		}	
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		System.out.println("output from Cc  " +p1.data);
		return p1;
	}

}

