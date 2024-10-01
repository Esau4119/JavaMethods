
/*
* Esau Bojorquez Medina 


* 2239. Find Closest Number to Zero
* We get an array size of n 
* we give back an integer closest to 0
* what if we get back a zero? 

* Store the lowest number we see 
* looping through the array and comparing our first integer to *  
* the next one. 

* we are returning the largest number part since we fail at returning the neageives
*/
 // Test cases: nums = {2, -1, 1} 

class Solution {
	public int findClosestNumber (int[] nums) {
		// need to check if we have more than one index
		if (nums.length < 1){
			return 0;
		}

		// need to store our lowest number; 
		int lowestNum = nums[0];

		// Starting ahead since we already have our first 
		for( int i = 1; i < nums.length; i++){
			
			if (Math.abs(nums[i]) < Math.abs(lowestNum)){		
				lowestNum = nums[i]; 
			// When abs has equal numbers we compare the original integers. 
			}else if (Math.abs(nums[i]) == Math.abs(lowestNum)){
				// returning the largest number between the two. 
				lowestNum = Math.max(nums[i],lowestNum);	
			}
		}

		return lowestNum; 
	}

}
