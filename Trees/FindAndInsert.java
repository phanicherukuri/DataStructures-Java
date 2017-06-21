package trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Trees {
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

    boolean result = root.find(1);
    System.out.println(result);
    root.insert(55);
    root.insert(4);
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
	  //no-arg constructor
	}
  public void insert(int value)
  {
    if(value <= data)
    {
      if(left==null)
      {
        left = new Node(value);
      }else{
        left.insert(value);
      }
    }
    else
    {
      if(right == null)
      {
        right = new Node(value);
      }else{
        right.insert(value);
      }
    }
  }
  public boolean find(int value)
  {
    if(data==value)
    {
      return true;
    }
    else if(value < data)
    {
      if(left == null)
      {
        return false;
      }else{
        return left.find(value);
      }
    }
    else{
      if(right==null)
      {
        return false;
      }else{
        return right.find(value);
      }
    }
  }
}
