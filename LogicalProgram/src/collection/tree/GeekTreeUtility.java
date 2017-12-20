package collection.tree;

public class GeekTreeUtility {
public static void main(String[] args) {
	GeekTreeUtility gt = new GeekTreeUtility();
	gt.populateGeekTreeDirect();
}

public void  populateGeekTreeDirect(){
	GeekTree tree = new GeekTree();
	tree.root=new GeekTreeNode(1);
	tree.root.left = new GeekTreeNode(2);
    tree.root.right = new GeekTreeNode(3);
    tree.root.left.left = new GeekTreeNode(4);
    tree.root.left.right = new GeekTreeNode(5);
	
}
}
