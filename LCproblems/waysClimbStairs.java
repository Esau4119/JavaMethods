
/*
Esau B Medina
	Problem: Given n steps to reach the top of a staircase, return the number of ways we can get to the top;  
input: int n of step
	output: integer 
	exp: given n = 3
	return 3
ok so first i can set up the base cases of 1 and 2 steps
	but for more than that we need to loop through an array keeping track the next step and the previous 2 since those are the ones we can move off of.
handle the base cases
create the variabels 
enter a loop to handle 2-n 
*/	

class Solution{

	public int climbStairs (int n ){
		if(n == 1){
			return 1; 
		}
		if(n == 2){
			return 2; 
		}
		// create some variables
		int oneB = 2; 
		int twoB = 1; 

		for(int i = 2; i < n; i ++){
			int next = twoB + oneB;
			twoB = oneB;
			oneB = next; 
		}	

		return oneB; 

	}

}
