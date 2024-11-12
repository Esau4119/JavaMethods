
/*
Esau B Medina
	Problem: given the root of a tree, do a binary tree level order traversal(BFS)
can i use a arraylist and linklist?

input: TreeNode root; 
outout: list of nodes in binary level order
 


*/


class Solution {
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> finalList= new ArrayList(); 
		// Base Case of empty tree
		if (root == null ){
			return finalList; 
		}

		// BFS for a tree we need a linklist Queue
		Queue<TreeNode> trav = new LinkedList<>();
		// add in our first element
		trav.add(root);


		// Now we traverse and add in elements
		while(!trav.isEmpty()){
			List<Integer> level = new ArrayList(); 
			int Qsize = trav.size(); 
			for(int i =0; i < Qsize ; i++){
				TreeNode curr = trav.poll();
				level.add(curr.val);
				// now we can add in our sides to the queue
				if (curr.left != null ){
					trav.add (curr.left);
				}
				if (curr.right != null ){
					trav.add (curr.right);
				}
			}
			finalList.add(level);
		}
		return finalList; 
	}

}
