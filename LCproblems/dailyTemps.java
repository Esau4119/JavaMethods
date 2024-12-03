






/*
Esau B Medina
	Problem: given an array of integer that contain tempatures, return an array such that answer at i is the number of days that you get a warmer tempature; 

	input: single array, with only integers? 
		output: array with the number of days 
	what if we never find a warmer temp? we keep the index at zero;	
		what if we get an empty array? return a new list with one zero? 

	 For this problem, we are going to be using a stack, this way we can keep track of the highest tempature and move along in a linear fashion. 

		We will keep track of the temp and index for that tempature. 
		return an array with the needed day distances. 
Create the stack
initialize the answer array
traverse the tempature array, 
update our stack if we see a lower temp
add the current temp with index in an array. 
ex: {737,74,75,71,69,72,76,73}

*/

import java.util.Stack; 
class Solution{
	public int[] dailyTemperatures(int[] tempatures ){
		// create the stack
		Stack<int[]> tempStack = new Stack<>(); 
		int[] ans = new int[tempatures.length];
		
		// iterate through our tempatures
		for(int i = 0; i < tempatures.length; i++){
			// check our stack
			while(!tempStack.isEmpty() && tempStack.peek()[0] < tempatures[i]){
				int[] prev = tempStack.pop();
				ans[prev[1]] = i - prev[i]; //distance bewteen the “day”
			
			}

			// add into the stack
			tempStack.push(new int[]{tempatures[i], i});
		}	

		return ans; 

	}


}
