package arrays;

import java.util.Stack;

public class DFS {

	public static void main(String[] args) {
		DFSNode root = new DFSNode(47);
		DFSNode n1 = new DFSNode(2);
		DFSNode n2 = new DFSNode(1);
		DFSNode n3 = new DFSNode(40);
		DFSNode n4 = new DFSNode(20);
		DFSNode n5 = new DFSNode(38);
		DFSNode n6 = new DFSNode(49);
		DFSNode n7 = new DFSNode(48);
		DFSNode n8 = new DFSNode(50);
		
		root.left = n1;
		root.right = n6;
		n1.left = n2;
		n1.right = n3;
		n3.left= n4;
		n4.right=n5;
		n6.left = n7;
		n6.right = n8;
		
		root.depthFirstSearch(root);
	}

}


class DFSNode{
	int value;
	DFSNode left,right;
	boolean visited = false;
	
	public DFSNode() {
		// TODO Auto-generated constructor stub
	}
	public DFSNode(int value)
	{
		this.value = value;
	}
	
	public void depthFirstSearch(DFSNode root)
	{
		Stack<DFSNode> stack = new Stack<DFSNode>();
			if(root!=null)
			{
				stack.push(root);
				root.visited = true;
				while(!stack.isEmpty())
				{
					DFSNode temp = stack.pop();
					System.out.println(temp.value);
					if(temp.right!=null && temp.right.visited == false)
					{
						stack.push(temp.right);
						temp.visited = true;
					}
					if(temp.left!=null && temp.left.visited==false)
					{
						stack.push(temp.left);
						temp.visited = true;
					}
				}
			}
	}
}
