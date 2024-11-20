/*
Esau B Medina
	Problem: combination sum, given an array of candidates return the target sum combinations possible form the candidates listl 

		input: array of integers, and a target int
			output: List of lists containing the integers that sum up to target. 
	ok so to do this in avoid doing a binary search, we can make use of a DFS recursive function. This backtrack will keep track of our sums, and input into our final results list

*/

class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target ){
		// Set up backtrack elements
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> sol = new ArrayList<>();
		
		backTrack(candidates, target, 0,0,  result, sol);
		return result; 
	}
	
	public void backTrack(int[] candidates, int target, int i ,int curSum,List<List<Integer>>  results, List<Integer> sol){
		// base case
		if (curSum == target){
			results.add(new ArrayList<>(sol));
			return;
		}

		if(curSum > target || i == candidates.length){
			return;
		}

		// traverse both sides of result tree
		// Skipping/going all left
		backTrack(candidates, target, i+1 ,curSum,  results, sol);
		
		// Picking set
		sol.add(candidates[i]);
		backTrack(candidates, target, i ,curSum + candidates[i],  results, sol);
		sol.remove(sol.size()-1);
	}

}
