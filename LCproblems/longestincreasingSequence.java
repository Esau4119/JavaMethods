/*
Esau B Medina 
	Problem: Given an integer array return teh longest increasing substring. 
	ok so this problem we will be using an array filled with 1s. As we traverse the given nums array we will be checking if we have a sequece. If so we will be incrementeing and applying the largest number we have possible between i and j. 
	Input: nums array 
		output: integer. 

		


*/
class Solution {
	public int lengthOfLIS(int[] nums){
		// array with 1s 
		int [] tracker = new int[nums.length];
		Arrays.fill(tracker, 1);
		
		// check for longest sequence
		for(int i = 1; i < nums.length; i++){
			for (int j= 0; j< i; j++ ){
				if(nums[i] > nums[j]){
					tracker[i]= Math.max(tracker[i], tracker[j]+1);
				}
			}
		}
		// get the max out 
		int maxLength = 0; 
		for(int maxNum: tracker){	
			maxLength = Math.max(maxNum, maxLength); 
		}
		return maxLength;
}


}
