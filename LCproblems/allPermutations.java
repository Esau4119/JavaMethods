/*
Esau B Medina 

Problem: given an array of integers return all permutations of each elementa within the array. 

	input: single int array 
		output: 2d array of all permutations
	ex: nums[1,2,3] -> {{1,2,3}{1,3,2}{2,1,3}{2,3,1}{3,2,1}[3,1,2]}
	Ok so given we need to get all possible, we can see this as a tree of answers, we can achieve all 	possible through a bit of backtracking through this tree. Like a bit of dfs. 

*/
class Solution{

	public List<List<Integer>> permute(int[] nums){
		// 3 lists, our results, a immediate solutions, and a seen list; 
		List<List<Integer>> results = new ArrayList<>(); 
		List<Integer> sol = new ArrayList<>();
		boolean[] visited = new boolean[nums.length];

		backTrack(nums,results, sol, visited);
 		return results; 

	}
	private void backTrack(int[] nums, List<List<Integer>> results, List<Integer> sol, boolean[] visited){
		// base case of reaching the needed size of immediate answer
		if(sol.size() == nums.length){
			results.add(new ArrayList<>(sol));
			return; 
		}

		//here we can cycle through all possible answers;
		for(int i = 0; i < nums.length; i ++){
			// check if we have seen 
			if(visited[i] == true){
				continue; 
			}
			visited[i] = true;
			sol.add(nums[i]);
			backTrack(nums,results, sol, visited);
			// then we undo the above
			visited[i] = false;
			sol.remove(sol.size()-1);
 
	
		} 

	} 	


}
