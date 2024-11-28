
/*

Esau B Median
	Problem: given a root of a tree determin if a valid binary serach tree 
	meaning left of tree is a node that contanes keys less than nodes key
		and right of tree contains nodes that are greater. 
			both left and right subs need to be valid
ok so with a tree we can infer that we are going to be doing recursive dfs along the tree. this requires a helper function to move us along down to the end of the tree where we check the right and left conditions then pass that into the recursive stack. 

*/
class Solution{
	public boolean isValidBST(TreeNode root){
		boolean isVal = validDFS(root, Long.MIN_VALUE, Long.MAX_VALUE);
		return isVal; 
	} 

	private boolean validDFS(TreeNode currNode, long minNum, long maxNum){
		if(currNode == null){
			return true;
		}
		if (currNode.val <=minNum ||currNode.val >= maxNum){
			return false; 

		}
		return validDFS (currNode.left, minNum, currNode.val)&& validDFS(currNode.right,currNode.val, maxNum);

	}


}
