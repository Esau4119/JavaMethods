/*
Esau B Medina 
	problem: get the maximum average subarray
		input : int[] nums and k 
			output: a double
		ok so we need to get the first average with k elements in the array
		by looping k times and getting the average 
		then we open the window of k length with i+k and i-k and get the average 
as we traverse. 
		o(k+n) for space and time since we are just storing a max and loop k the array once

*/

class Solution{
	public double findMaxAverage (int [] nums, int k ){
		// get the first max

		
		double sum = 0; 
		for(int i = 0; i < k ; i++){
			sum += nums[i]; 
		}
		
		double maxAvg = sum/k;


		// now we open the window
	

		for(int i = k; i < nums.length; i ++){
			sum += nums[i];
			sum  -= nums[i-k];
			double sumWind = sum / k; 
			maxAvg = Math.max(maxAvg, sumWind);
		
		}

		return maxAvg;
	}


}
