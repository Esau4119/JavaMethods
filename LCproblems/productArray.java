
/*
	Esau B Medina 
	Problem: Given an array return the product of every other index other than the current. 
	input: non sorted integer array
		output: array of products; 
			ex: [1,2,3,4]
				[24,12,8,6]
	are we worried about empyt arrays? need it in linear time? 

*/


class Solution {
	public int[] productExceptSelf(int[] nums) {
		int[] finalProds = new int[nums.length]	;	

		// store products
		int prodL = 1;
		int prodR = 1;
	
		// Iteration left
		for(int i = 0; i < nums.length; i++){
			finalProds[i] = prodL;
			prodL = prodL* nums[i];
		} 

		// Iteration right
		for(int i = nums.length-1; i>= 0; i--){
		
			finalProds[i]  *= prodR;
			prodR = prodR* nums[i];
		

		} 
		return finalProds;
	}

}

