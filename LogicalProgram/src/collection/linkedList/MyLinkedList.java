package collection.linkedList;

//import collection.linkedList.SingleLinkedList.Node;

public class MyLinkedList {

	 Node head;
	 
     class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
    
    
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    void printList(Node node) {
    	//System.out.println("head is" + node.data);
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
