
/
*

Esau B Medina	
Problem: Summary Ranges, geven a unique sorted interger array return the smallest sorted list of ranges taht cover all numbers. 


input : Sorted int array {1, 2 ,4 ,5,7,}
	output: list of stored string array with -> i between the ranges. 


*/

import java.util.List; 
import java.util.ArrayList; 

class Solution{
	public List<String> summaryRanges (int[] nums){
        // New list for ranges
        List<String> sums = new ArrayList<String>();

        // iteration set up 
        for(int i = 0; i < nums.length; i++){
            int counter  = nums[i]; 
            // check ahead for stop condition
            while(i< nums.length-1 && nums[i+1] == nums[i]+1 ){
            	i++;
            }
            // string case for longer than 0 range 
            if (counter != nums[i]  ){
                String range = (counter )+ "->"+ nums[i]; 
                sums.add(range);

            // when we dont have any number past the start of range
            }else if (nums[i] ==  counter){
                String range = String.valueOf(nums[i]);;
                sums.add(range);
            }

        }   	

        return sums; 
            
    }
}
