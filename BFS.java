package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
	BFSNode root = new BFSNode(46,0);
	BFSNode n1 = new BFSNode(2,1);
	BFSNode n2 = new BFSNode(1,2);
	BFSNode n3 = new BFSNode(40,2);
	BFSNode n4 = new BFSNode(20,3);
	BFSNode n5 = new BFSNode(38,4);
	BFSNode n6 = new BFSNode(49,1);
	BFSNode n7 = new BFSNode(48,2);
	BFSNode n8 = new BFSNode(50,2);
	
	root.left = n1;
	root.right = n6;
	n1.left = n2;
	n1.right = n3;
	n3.left= n4;
	n4.right=n5;
	n6.left = n7;
	n6.right = n8;
	
	root.breadthFirstSearch(root);
	}

}

class BFSNode{
	int value,level;
	BFSNode left, right;
	public BFSNode(){
		//no-arg constructor
	}
	public BFSNode(int value, int level){
		this.value = value;
		this.level = level;
	}
	
	public void breadthFirstSearch(BFSNode root)
	{
		Queue<BFSNode> queue = new LinkedList<BFSNode>();
		if(root!=null)
		{
			queue.add(root);
			while(!queue.isEmpty()){
				BFSNode temp = queue.poll();
				System.out.println("node: "+temp.value+" \t level: "+temp.level);
				if(temp.left!=null)
					queue.add(temp.left);
				if(temp.right!=null)
					queue.add(temp.right);
			}
		}
	}
}