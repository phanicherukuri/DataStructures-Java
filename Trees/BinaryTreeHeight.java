package trees;

public class BinaryTreeHeight{
	
	public static void main(String[] args) {
		
	Node root = new Node(47);
	Node n1 = new Node(2);
	Node n2 = new Node(1);
	Node n3 = new Node(40);
	Node n4 = new Node(20);
	Node n5 = new Node(38);
	Node n6 = new Node(49);
	Node n7 = new Node(48);
	Node n8 = new Node(50);
	root.left = n1;
	root.right = n6;
	n1.left = n2;
	n1.right = n3;
	n3.left= n4;
	n4.right=n5;
	n6.left = n7;
	n6.right = n8;

  int height = root.height(root);
	System.out.println("height: "+height);
	}
}

class Node{
	int data;
	Node left, right;
	public Node(int data)
	{
		this.data = data;
	}
	public Node(){
		
	}
  
	public int height(Node root)
	{
		if(root==null || root.left==null && root.right==null)
		{
			return 0;
		}
		else{
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			if(leftHeight > rightHeight){
				return (leftHeight+1);
			}else{
				return (rightHeight+1);
			}
		}
	}	
}
