package collection.tree;

public class GeekTreeNode {
	int data;
	GeekTreeNode left, right;
     
	GeekTreeNode(int d) {
        data = d;
        left = right = null;
    }

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public GeekTreeNode getLeft() {
		return left;
	}

	public void setLeft(GeekTreeNode left) {
		this.left = left;
	}

	public GeekTreeNode getRight() {
		return right;
	}

	public void setRight(GeekTreeNode right) {
		this.right = right;
	}
}
