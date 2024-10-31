/*
Esau Bojorquez medina
	Problem: given a integer that represtents a stair case, return the amount of ways u can climb the 	stairs. 
	we can move 1 or 2 steps; 
	ok so we need to get our bases cases out of the way and then we can calculate the amount of steps we can take
	
*/

class Solution {
	public int climbStairs(int n ){
		if (n == 1){
			return 1; 
		}
		if (n == 2){
			return 2; 
		}

		int  backTwo= 1;
		int backOne  = 2;

		for (int i = 2; i < n; i++){
			int next= backTwo + backOne;
			backTwo = backOne; 
			backOne = next;

		}

	return backOne; 

	}

}
