/*

*Esau Bojorquez Medina
*	Problem: invert binary tree

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
