/*
* Esau B Medina
Problem: given a tree, check to see if we have a path that adds up to a target sum
QA; waht do we want to return, is it base from the root node to a leaf, what are we getting? 
DFS recursion 


*/

class Solution{
	public boolean hasPathSum (TreeNode root, int targetSum){
		return hasSum(root,0,targetSum); 

	}	

	public boolean hasSum( TreeNode root, int currSum, int targetSum){
		// Base case
		if(root == null){
			return false; 
		}

		// add out summ of our current node
		currSum = currSum + root.val; 
	
		// if we reach the end here we can return out value
		if (root.right == null && root.left == null){
			if (currSum == targetSum){
				return true;
			}else{
				return false;
			}

		}
		// Recursive call
		return hasSum(root.left,currSum, targetSum) || hasSum(root.right, currSum, targetSum) ;


	}


}
