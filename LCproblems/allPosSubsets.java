
/*
Esau B Medina
	Problem given an integer array nums of unique elements, return all possilbe subsets . 
	input: int array of numbers
		output array of lists that holds all the subsets
		ex:{1,2,3} [[1][2][3],[1,2][2,3][1,3][1,2,3]]

ok so for this problem I am going to be using a recursive backtracking method. This method will cycle through in a DFS mannor to each of our possible solutions.
	
*/

import java.util.ArrayList;
import java.util.List;
class Solution{

	public List<List<Integer>> subsets(int[] nums){
		// need to store our main result
		List<List<Integer>> result = new ArrayList<>();

		// need to store our current solution or one of the indexes in result
		List<Integer> sol = new ArrayList<>();

		backtrack(nums,0, result, sol);
		// return the results
		return results; 
	}
	
	public void backtrack(int[] nums,int start, List<List<Integer>> results,List<Integer> sol){
		// base case 
		results.add(new ArrayList<>(sol));

		for(int i = start; i < nums.length; i++){
			sol.add(nums[i]);
			backtrack(nums, i+1, results, sol);
			sol.remove(sol.size()-1);
		}	



	}
}
