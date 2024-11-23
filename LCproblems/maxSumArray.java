
/*
Esau B Medina 
Problem : is if given an arary, return the max sum of the array.
	Do we have a k number of elements? no 
		do we want the numbers returned or just the max? 
			
OK so we can think of this as a simple linear search through the array. Keeping track of our max number we get by summing up the integers. 
*/

class Solution{
	public int maxSubArray(int[] nums){
		// we need a Minimum number to start
		int maxSum = Integer.MIN_VALUE; 
		
		// we also need a current sum 
		int currSum =0; 

		// now we can iterate throught the array. 

		for(int number : nums){
			currSum = currSum + number; 
			maxSum = Math.max(maxSum, currSum);

			if(currSum < 0){
				currSum = 0;
			}


		}
		return maxSum; 
	}


}
