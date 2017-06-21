package trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TreeView {
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
	
	root.topView(root);
	}
}

class Node{
	static Set<Integer> list = new LinkedHashSet<Integer>();
	int data;
	Node left, right;
	public Node(int data)
	{
		this.data = data;
	}
	public Node(){
		//no-arg constructor
	}

	void topView(Node root) {
		root.leftView(root);
		root.rightView(root);
		Iterator it = list.iterator();
		while(it.hasNext()){
			  System.out.print(it.next()+" ");
		}
	}
	
	void leftView(Node root){
		if(root.left!=null){
          left.leftView(root.left);
          list.add(root.data);
     }else{
     		  list.add(root.data);
        }
  }
	
	void rightView(Node root){
		if(root.right!=null){
			    list.add(root.data);
			    right.rightView(root.right);
     }else{
          list.add(root.data);
     }
  }
