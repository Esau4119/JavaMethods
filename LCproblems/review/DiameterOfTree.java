/
* Esau Bojorquez Medina
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
