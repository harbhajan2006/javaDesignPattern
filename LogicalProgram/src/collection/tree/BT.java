package collection.tree;

/* Class BT */
public class BT
{
    private BTNode root;

    /* Constructor */
    public BT()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data );
    }
    /* Function to insert data recursively */
    private BTNode insert(BTNode node, int data )
    {
    	//direction -1 is left , 1 is right , default left
        if (node == null)
            node = new BTNode(data);
        else
        {
        	
        	
            /*if (node.getRight() == null){
                node.right = insert(node.right, data , 1);
            }else{
                node.left = insert(node.left, data , -1); 
            }*/
        	
        	if (node.getLeft() == null){
            node.left = insert(node.left, data , -1);
        	} else {
            node.right = insert(node.right, data , 1); 
        	}
        }
        return node;
    }
    
    private BTNode insert(BTNode node, int data , int direction)
    {
    	//direction -1 is left , 1 is right , default left
        if (node == null)
            node = new BTNode(data);
        else
        {
        	
        	 if(direction==1){
        		node.right = insert(node.right, data , 1);
        	}else{
        		 node.left = insert(node.left, data , -1); 
        	}
            
        }
        return node;
    }
    public  BTNode populateBSTree(int[] arr , int start , int end ){
    	// 1 2 3 4 5
    	if(end<start)
    		return null;
    	int mid = (start+end)/2;
    	BTNode node = new BTNode(arr[mid]);
    	
    	node.left=populateBSTree( arr , start , mid-1);
    	node.right=populateBSTree( arr , mid+1 , end);
    	
    	return node;
    }
    /* Function to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    /* Function to count number of nodes recursively */
    private int countNodes(BTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    /* Function to search for an element */
    public boolean search(int val)
    {
        return search(root, val);
    }
    /* Function to search for an element recursively */
    private boolean search(BTNode r, int val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;         
    }
    /* Function for inorder traversal */
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(BTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(BTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    /* Function for postorder traversal */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(BTNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }  
    
    
   public  void levelOrder()
    {
        int h = getHeight(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
   
   public int getHeight(BTNode root)
   {
       if (root == null)
          return 0;
       else
       {
           /* compute  height of each subtree */
           int lheight = getHeight(root.left);
           int rheight = getHeight(root.right);
            
           /* use the larger one */
           if (lheight > rheight)
               return(lheight+1);
           else return(rheight+1); 
       }
   }


/* Print nodes at the given level */
public void printGivenLevel (BTNode root ,int level)
{
    if (root == null)
        return;
    if (level == 1)
        System.out.print(root.data + " ");
    else if (level > 1)
    {
        printGivenLevel(root.left, level-1);
        printGivenLevel(root.right, level-1);
    }
}

public void getTreeNodeHeight(Object obj){
	System.out.println("in Obj method");
	getTreeNodeHeight(root);
}

public int getTreeNodeHeight(BTNode node){
	//return  Math.max(getTreeNodeHeight(node.left),
	//getTreeNodeHeight(node.right));
if (node == null)
{
    return 0;
}
else
{
    return 1 +
    Math.max(getTreeNodeHeight(root.left),getTreeNodeHeight(root.right));
}
}

public int getTreeNodeHeight(){
	// tree.getRoot();
	int height=0;
	BTNode node=root;
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
		node = node.getRight();
		height++;
	}
	System.out.println("right height "+ height);
	return height;
	
}
}
/* Class BinaryTree */
