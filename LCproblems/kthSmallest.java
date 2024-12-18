/*
Esau B Medina 
Problem: Given the root of a tree return the k smallest value 
input: tree node root and integer k 
output: int value of the kth value
 ok so given a BST or binary search tree, all the numbers are in order left to right from smallest to biggest. Utilizing this we can DFS and do an inorder process. Going all the way to the left we can decrement our K until we reach the desired element. 

*/
class Solution {
	private int counter; 
	private int ans ;
	public int kthSmallest(TreeNode root, int k ){
		counter = k; 
		ans = 0 ;
		dfs(root);
		return ans ; 
	
	}
	private void dfs(TreeNode root){
		if(root == null){
			return ; 
		}

		dfs(root.left);


		if(counter == 1){
			ans = root.val; 

		}

		counter --; 

		if(counter > 0){
			dfs(root.right);

		}
	
	}

}
