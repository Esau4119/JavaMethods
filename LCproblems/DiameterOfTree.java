* Esau Bojorquez Medina
* Problem: Given a tree, return the largest diameter within the tree. 
* can or cant pass throught the root node.
* DFS recursive tree traversal, Storing the largest max diameter we see. 
*/

class Solution {
	public int maxDia = 0;

	public int diameterOfBinaryTree (TreeNode root){
		grabHeight(root); 
		return maxDia;
	}
	public int grabHeight(TreeNode root){
		// Base case
		if(root == null){
			return 0; 
		}

		// traversal 
		int left_Height = grabHeight(root.left);
		int right_Height = grabHeight(root.right);
		
		// Find the diameter
		int diameter = left_Height + right_Height;
		maxDia = Math.max(maxDia, diameter );


		return 1 + Math.max(left_Height, right_Height); 

	}	



}
