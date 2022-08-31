package BinaryTree;

import java.util.Scanner;

public class Implementation {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) { // constructor
			this.data = data;
			this.left = this.right = null;

		}
	}

	
	static class buildTree{
		
		static Node BinaryTree() {
			Scanner sc = new Scanner(System.in);
			Node root = null;
			System.out.println("Enter data: ");
			int data = sc.nextInt();

			if (data == -1)
				return null;

			root = new Node(data);

			System.out.println("Enter left for " + data);
			root.left = BinaryTree();

			System.out.println("Enter right for " + data);
			root.right = BinaryTree();

			return root;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		buildTree t1 = new buildTree();
		Node x = t1.BinaryTree();
		System.out.println(x.data);

	}

}
