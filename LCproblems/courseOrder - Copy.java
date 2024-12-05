

/*
Esau B Medina
	Problem: given an array, nums return if any value appears at least twice in the array
	input: integer array
		output: boolean
Ok so First create an empty set so that we can refer to that that list as we traverse the other indexes of the array; 
*/
class Solution{
	public boolean containsDuplicate(int[] nums ){
		// create set 
		HashSet<Integer> seen = new HashSet<>(); 
		

		// traverse
		for(int i = 0; i < nums.length; i ++){
			if(seen.contains(nums[i])){
				return true; 
			}
			seen.add(nums[i]);
		}
		return false; 
	}



}



