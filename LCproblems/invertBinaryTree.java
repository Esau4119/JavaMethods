/*

*Esau Bojorquez Medina
*	Problem: invert binary tree

* Given a tree, invert the subtree nodes so that they are on opposite ends. 
*	no negitive number, no strings just positive integers. 

*/

class Solution {

	public TreeNode invertTree( TreeNode root) {
		if (root == null) {
			return root; 
		}

		// DFS traversal of tree
		TreeNode left = invertTree(root.left); 		
		TreeNode right = invertTree(root.right); 	


		// Start swapping
		root.right = left;
		root.left = right;
 
		return root; 
	}	
}
