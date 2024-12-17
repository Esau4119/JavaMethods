
/*
Esau B Medina
Problem: Given a tree and a subtree node, return if the subtree is contained within the original tree/ 

Ok so for tree traversal we need to set up recurcion and check if we have the sub tree at every node. 


*/
class Solution{
	public boolean isSubtree(TreeNode root, TreeNode subRoot){
		boolean ans = hasSub(root, subRoot);
		return ans; 
	}

	private boolean hasSub(TreeNode root, TreeNode subRoot){
		if(root == null ){
			return false; 
		}
		if(isSame(root, subRoot)){
			return true; 
		}

		return hasSub(root.left, subRoot) || hasSub(root.right, subRoot);

	}
	private boolean isSame (TreeNode currNode, TreeNode sub){
		if(currNode == null && sub== null){
			return true; 
		}
		if(currNode == null || sub == null){
			return false; 
		}

		if(currNode.val != sub.val){
			return false; 
		}
		return isSame(currNode.left, sub.left) && isSame(currNode.right, sub.right);
	}	
}
