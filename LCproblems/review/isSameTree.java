/*
Esau B. Medina
Problem: Determin if two given trees are identical
*/

class Solution{
	public boolean isSameTree (TreeNode p, TreeNode q){
		
		boolean isSame = traversal(p,q); 
		return isSame; 
	}

		public boolean traversal (TreeNode root1 , TreeNode root2) {
			//base Case 
			if (root1 == null && root2 == null){
				return true; 
			}

			if (root1 == null || root2 == null){
				return false; 
			}


			// Compare the nodes
			if (root1.val!= root2.val){
				return false; 
			} 
			
			return traversal(root1.left, root2.left)&& traversal(root1.right, root2.right); 
		}

}
