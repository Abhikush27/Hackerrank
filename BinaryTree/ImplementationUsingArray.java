package BinaryTree;
import java.util.Scanner;

//import BinaryTree.Implementation.Node;

public class ImplementationUsingArray {
	
	
	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) { // constructor
			this.data = data;
			this.left = null;
			this.right = null;

		}
	}
	
	static class BinaryTree{
		static int idx =-1;
		
		public Node buildTree(int nodes[],int n) {
		
			
			idx++;
			if(nodes[idx]==-1)
				return null;
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes,n);
			newNode.right = buildTree(nodes,n);
			return newNode;
			
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter array size");
		n=sc.nextInt();
		int nodes[] = new int[n];
		System.out.println("Enter data");
		for(int i=0;i<n;i++) {
			nodes[i] = sc.nextInt();
		}
		
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes,n);
		System.out.println(root.data);

	}



	

}
