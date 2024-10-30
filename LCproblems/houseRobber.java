/*
Esau B Medina

	Problem: given an array, get the max amount of profit without counting adjacent indeces. House Robber
	no negative? no empty indexes, 
	ok so im thinking of doing a bottom up approach where we start at the 3 index and check our previous 2 moves to see if we have a max compared to if we rob the house. 

first we set up base cases of 0 and 1 being the max of index 2 or 3. then we need to check iterate through the rest and update our max profit given we rob a house
*/

class Solution {

public int rob(int[] nums){
		//base cases

		if (nums.length == 1){
			return nums[0];
		}
		if (nums.length == 2){
			return Math.max(nums[0], nums[1]);
		}

		int prev = nums[0];
		int curr = Math.max(nums[0], nums[1]);
		for(int i = 2; i < nums.length; i++ ){
			int swap = curr; 
			curr = Math.max(nums[i]+prev, curr);	
			prev = swap;	

		}
		return curr; 

	}	
}
