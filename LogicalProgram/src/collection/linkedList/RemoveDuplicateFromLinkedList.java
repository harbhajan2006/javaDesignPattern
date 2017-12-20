package collection.linkedList;

import java.util.Hashtable;

// Java program to remove duplicates from unsorted 
// linked list
 
class RemoveDuplicateFromLinkedList {
 
	static void remove_duplicates_withBuffer(MyLinkedList ll) {
		Hashtable ht = new Hashtable();
		MyLinkedList.Node node=ll.head;
		MyLinkedList.Node prev=null;

		while(node!=null){
			System.out.println("node data :: " + node.data);
			if(ht.containsKey(node.data)){
				prev.next=node.next;
			}else{
				ht.put(node.data, "true");
				prev=node;
			}
			node=node.next;
		}
		
		
	}
 
    /* Function to remove duplicates from an
       unsorted linked list */
    static void remove_duplicates(MyLinkedList ll) {
    	
    	MyLinkedList.Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = ll.head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here */
                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
 
    
 
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for(int i=1;i<5;i++){
        	list.push(i);
        }
        list.push(3);
        /*for(int i=2;i<3;i++){
        	list.push(i);
        }*/
       /* list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);*/
 
        System.out.println("Linked List before removing duplicates : \n ");
        list.printList(list.head);
 
        remove_duplicates_withBuffer(list);
        System.out.println("");
        System.out.println("Linked List after removing duplicates : \n ");
        list.printList(list.head);
    }
}