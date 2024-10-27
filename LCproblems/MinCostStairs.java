/*
Esau Bojorquez Medina

	Problem: given an array, return the minimum cost it would take to get to the end of the array. 
	any negative or floats?? 
		no ok
	can we start from just index or from the second ? 
	im thinking of a way we can do this from the bottom up. 
		we can use prev and curr to check our last 2 steps and compare the costs returning the minimum. 


*/
class Solution {

	public int minCostClimbingStairs(int[] cost){
		int prev = 0;
		int curr = 0; 

		for(int i =2; i <= cost.length; i++){
			int minCost = Math.min(cost[i-2]+ prev, cost[i-1] + curr);
			prev = curr;
			curr = minCost; 	
			

		}
		return curr;
	}

}
