package collection.tree.misc;

public class TreeNode {
	
		 int key;
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

		 public TreeNode(int item)
		 {
		     key = item;
		     left = right = null;
		 }
}
