/*
Esau B Medina

Problem: given a rotated sorted array, return the minimum from this array
		input: sorted rotated arry
		output: int 
Ok so we can so a semi two pointer approach with using a left and a right pointer. this can help us narrow down the search between a specific window. We will find the middle point of our array and see if we have a bigger number than the last at right. If so we can increment our left pointer by middle + 1 to get to the next number and next middle 
*/


class Solution{
	public int findMin(int[] nums){
		int left = 0;
		int right = nums.length-1; 

		while(left < right){
			int middle = left +(right - left)/2;

			if(nums[middle] > nums[right]){
				left = middle + 1; 
			}else{
				right = middle; 
			}


		}
		return nums[left]; 
	}

}
