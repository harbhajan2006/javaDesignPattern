package collection.tree.misc;

/* Class containing left and right child of current
node and key value*/
class Node extends TreeNode
{

	public Node(int item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
 /*int key;
 public int getKey() {
	return key;
}

public void setKey(int key) {
	this.key = key;
}

public Node getLeft() {
	return left;
}

public void setLeft(Node left) {
	this.left = left;
}

public Node getRight() {
	return right;
}

public void setRight(Node right) {
	this.right = right;
}

Node left, right;

 public Node(int item)
 {
     key = item;
     left = right = null;
 }*/
}

//A Java program to introduce Binary Tree
public class BinaryTreeSample
{
 // Root of Binary Tree
  public Node root;

 public Node getRoot() {
	return root;
}

public void setRoot(Node root) {
	this.root = root;
}

// Constructors
 BinaryTreeSample(int key)
 {
     root = new Node(key);
 }

 BinaryTreeSample()
 {
     root = null;
 }

 public static void main(String[] args)
 {
	 BinaryTreeSample tree = populateTree();
	 tree.printTree(tree.root);
 }
 
 
static  BinaryTreeSample populateTree(){
	 BinaryTreeSample tree = new BinaryTreeSample();
     /*create root*/
     tree.root = new Node(1);

     /* following is the tree after above statement

           1
         /   \
       null  null     */

     tree.root.left = new Node(2);
     tree.root.right = new Node(3);

     /* 2 and 3 become left and right children of 1
            1
          /   \
         2      3
       /    \    /  \
     null null null null  */


     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);
     
     
     tree.root.right.left = new Node(6);
     tree.root.right.right = new Node(7);
     /* 4 becomes left child of 2
                 1
             /       \
            2          3
          /   \       /  \
         4    5  	6     7
        /   \
       null null
      */
	return tree;
 }
  void printTree(Node root){
	 
	 //Node treeRoot = root;
	 if(root==null)
		 return;
	 System.out.println(root.getKey());
	 printTree( root.getLeft());
	 printTree(root.getRight());
	
 }
}
