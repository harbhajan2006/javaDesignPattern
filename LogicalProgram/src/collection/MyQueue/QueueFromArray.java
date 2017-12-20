package collection.MyQueue;

import java.util.Arrays;

// FIFO - whatever element is first inserted , should get out first.
// 
public class QueueFromArray {

	public int capacity;
	public int[] arr;
	public int front=0;
	public int rear=0;
	int counter=0;
	int size=0;
	
	
	// Queue is full when size becomes equal to 
    // the capacity 
    boolean isFull(QueueFromArray queue)
    {  return (queue.size == queue.capacity);
    }
      
    // Queue is empty when size is 0
    boolean isEmpty(QueueFromArray queue)
    {  return (queue.size == 0); }
      
	public QueueFromArray(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
		arr= new int[capacity];
		this.front=this.size=0;
		rear=capacity-1;
	}
	
	void enqueue( int item)
    {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)%this.capacity;
        System.out.println("rear E " + this.rear);
        this.arr[this.rear] = item;
        this.size = this.size + 1;
        //System.out.println(item+ " enqueued to queue");
    }
	
	
	// Method to remove an item from queue.  
    // It changes front and size
    int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        System.out.println("front DE " + this.front);
        int item = this.arr[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }
	
    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
          
        return this.arr[this.front];
    }
       
    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
          
        return this.arr[this.rear];
    }
	public void push(int val){
		// start inserting from 0
	if(front==capacity)
		{
		System.out.println("capacity full");
		}else{
		arr[front]=val;
		front++;
		}
		
	}
	
	
	public int pop(){
		int val = arr[rear];
		arr[rear]=0;
		rear++;
		front--;
		counter++;
		return val;
	}
	
	public int size(){
		return front;
	}
	
	public void printQueue(){
		for(int i=0;i<size;i++){
			System.out.print(" ");
			System.out.print(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		QueueFromArray q = new QueueFromArray(10);
		for(int i=1;i<11;i++)
		{
			q.enqueue(i);
		}
		
		for(int i=1;i<11;i++)
		{
			q.dequeue();
		}
		System.out.println(Arrays.toString(q.getArr()));
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
