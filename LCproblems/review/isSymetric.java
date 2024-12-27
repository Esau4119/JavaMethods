
/*
Esau B Medina

	problem: Given one tree, check if the the tree is symetrical
		
*/


class Solution {

	public boolean isSymmetric (TreeNode root){
		// root and root since we only have one tree
		// and we need the same starting point
		return traverse(root, root); 
	}

	// Need to check two sides at once
	public boolean traverse (TreeNode root1, TreeNode root2){
	
		// Base cases
		if (root1 == null && root2 == null){
			return true;// Because we have hit the end of our tree
		}	
		if(root1 == null || root2 == null){
			return false; 
		}

		// Compare our values that we see
		if (root1.val != root2.val){
			return false; 
		}


		//Recursive call
		// We need to move in a mirroring fashion 
		return traverse(root1.left, root2.right) && traverse(root1.right, root2.left);

	}

}
