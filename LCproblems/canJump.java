/*
Esau B MEdina 
	Problem: given an integer array with numbers of jumps, return if it is possible to get to the end of the array with the number of jumps at each index
	input: int array
		output: boolean
	ex: [3,2,1,0,4]  = false;
	
*/

class Solution{
	public boolean canJump (int[] nums){
		int goal = nums[nums.length-1];
		for(int i = nums.length-1; i >= 0; i--){
			if (i + nums[i] >= goal){
				goal = i; 
			}

		}
		if(goal ==0){
			return true;
		}
		return false; 
	}

}
