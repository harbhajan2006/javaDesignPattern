package collection.tree.misc;

public class TreeUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTreeSample tree = BinaryTreeSample.populateTree();
		 tree.printTree(tree.root);
		System.out.println("height is:::" +getTreeNodeHeight(tree.getRoot())); 
	}

	static public int getTreeNodeHeight(TreeNode node){
		// tree.getRoot();
		int height=0;
		TreeNode root=node;
		if(node==null)
			return 0;
		
		while(node!=null)
		{
			node = node.getLeft();
			height++;
		}
		System.out.println("left height "+ height);
		node=root.getRight();
		height=0;
		while(node!=null)
		{
			node = node.getLeft();
			height++;
		}
		System.out.println("right height "+ height);
		return height;
		//return  Math.max(getTreeNodeHeight(node.left),
        		//getTreeNodeHeight(node.right));
		 /*if (node == null)
		    {
		        return 0;
		    }
		    else
		    {
		        return 1 +
		        Math.max(getTreeNodeHeight(node.left),
		        		getTreeNodeHeight(node.right));
		    }*/
	}
}
