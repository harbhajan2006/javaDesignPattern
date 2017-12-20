package collection.linkedList;

public class DeleteMiddleNode {

	static MyLinkedList.Node getNFromStart(int n , MyLinkedList.Node head){
		MyLinkedList.Node node = head;
		for(int i=0;i<n-1;i++){
			node=node.next;
		}
		//System.out.println(node.data);
		return node;
	}
	
static void	deleteGivenNode(MyLinkedList.Node middleNode){
	MyLinkedList.Node nextNode =middleNode.next;
	// 5 4 3 2 1
	//System.out.println(nextNode.data);
	middleNode.data=nextNode.data;
	middleNode.next=nextNode.next;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		for (int i = 0; i < 5; i++) {
			list.push(i+1);

		}
		list.printList(list.head);
		deleteGivenNode(getNFromStart(3, list.head));
		System.out.println();
		list.printList(list.head);
	}

}
