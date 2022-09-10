package Hackerrank.BinaryTree;

import java.util.ArrayList;
import BinaryTree.Implementation.*;

//import BinaryTree.Implementation.Node;

public class FindLCA {

	public static class AllAncestors {
		
		private static Node LCA(Node root, int n1, int n2) {
	        // Stores path from root to n1
	        ArrayList<Node> path1 = new ArrayList<>();
	        // Stores path from root to n2
	        ArrayList<Node> path2 = new ArrayList<>();
	        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
	            // Either n1 or n2 does not exists in the tree
	            return null;
	        }
	        // Compare the two path arrays
	        Node LCA = null;
	        for (int i = 0; i < path1.size() && i < path2.size(); i++) {
	            if (path1.get(i) != path2.get(i)) {
	                // First non common node
	                break;
	            } else {
	                LCA = path1.get(i);
	            }
	        }
	        return LCA;
	    }
	  
	    private static boolean findPath(Node root, int n, ArrayList<Node> path) {
	        if (root == null) {
	       
	            return false;
	        }
	        // Add the current root in the path array
	        path.add(root);
	        // If this node is the required node return true
	        if (root.data == n) {
	            return true;
	        }
	        // Find path in the left and right sub tree
	        if (findPath(root.left, n, path) || findPath(root.right, n, path)) {
	            // If there is a path in either left or right sub tree return true
	            return true;
	        }
	        // Else remove root from path array and return false
	        path.remove(root);
	        return false;
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buildTree plant2 = new buildTree();
		Node root = plant2.BinaryTree();
		Node x = LCA(root,4,5);
System.out.println(x.data);
	}
	}
}



