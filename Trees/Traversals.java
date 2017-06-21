package trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Traversals {
	
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
	root.printPreOrder(root);
	root.printInOrder(root);
  root.printPostOrder(root);
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

	public void printInOrder(Node root){
		if(left!=null)
		{
			left.printInOrder(root.left);
		}
		System.out.println(root.data);
		if(right!=null)
		{
			right.printInOrder(root.right);
		}
	}
	
	public void printPreOrder(Node root){
		System.out.println(root.data);
		if(left!=null)
		{
			left.printPreOrder(root.left);
		}
		if(right!=null)
		{
			right.printPreOrder(root.right);
		}
	}
	
	public void printPostOrder(Node root){
		if(left!=null)
		{
			left.printPostOrder(root.left);
		}
		if(right!=null)
		{
			right.printPostOrder(root.right);
		}
		System.out.println(root.data);
	}
}

