package BinaryTree;
import java.util.*;

import BinaryTree.Implementation.*;

public class LevelOrder {
	
	public static void traverse(Node root, int level) {
		
		 if(root==null)
			 return ;
		 if(level==1)
			 System.out.println(root.data+" ");
		 
		 else if(level>1)
		 {
			 traverse(root.left,level-1);
			 traverse(root.right,level-1);
		 }
		
	}

	public static void main(String[] args) {
		
		buildTrees t2 = new builTrees();
		Node nodes = t2.BinaryTree();
		levelOrder(nodes);

	}

}
