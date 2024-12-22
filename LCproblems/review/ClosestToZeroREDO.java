
/*
* Esau Bojorquez Medina 


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
