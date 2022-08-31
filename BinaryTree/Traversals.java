package BinaryTree;

import java.util.*;
import BinaryTree.Implementation.buildTree;
import BinaryTree.Implementation.Node;

public class Traversals {
	
	public static void inOrder(Node root)
	{
		if(root==null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void preOrder(Node root)
	{
		if(root==null) {
			return;
		}
		
		System.out.println(root.data+" ");
		preOrder(root.left);
		
		preOrder(root.right);
	}
	
	public static void postOrder(Node root)
	{
		if(root==null) {
			return;
		}
		
		
		preOrder(root.left);
		
		preOrder(root.right);
		System.out.print(root.data+" ");
	}
	 
//	Level order Treversal is Important
	
	
	public static void main(String[] args) {

		buildTree trees = new buildTree();
Node root = trees.BinaryTree();

inOrder(root);
	}

}
