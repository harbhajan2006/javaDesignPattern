package collection.tree;

public class ArrayToBST {
public static void main(String[] args) {
	BT bst = new BT();
	
	int arr[] =  {1,2,3,4,5};
BTNode bt=	bst.populateBSTree(arr, 0, arr.length-1);
	print(bt);

}

public static void print(BTNode node){
	if(node==null)
		return;
	System.out.println(node.data + " ");
	print(node.left);
	print(node.right);
}
}
