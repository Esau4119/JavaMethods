/*
* Esau B Medina
* Problem: Given a tree, determin if the height is balanced. 

*/ 

class Solution{
	public boolean isBalanced(TreeNode root){
		
	//DFS search method call 
		if (checkHeight(root) == -1){
			return false;
		}
 		return true; 
		
	}

	public int checkHeight(TreeNode root){
		// Base Case
		if (root == null ){
			return 0; 
		}

		// Traverse left and check if we have any inbalance
		int left = checkHeight(root.left);
		if(left == -1){
			return -1; 
		} 

		//Traverse right and check for inbalance
		int right = checkHeight(root.right); 
		if(right == -1){
			return -1; 
		}


		if (Math.abs(left - right) >1){
			return -1; 
		}
		//Grabbing our height
		return 1+ Math.max(left, right); 

	}


}
