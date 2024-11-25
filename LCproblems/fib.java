/*
Esau B Medina 

	Problem: Fibonaccia sequence
	using an space optimal solution

	ok if we think about the problem we can iterate adding our sums of the current and the previous to each other. 
* /


class Solution{
	public int fib (int n ){
		// first 2 number cases

		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		
		int prev = 0; 
		int curr = 1; 


		for(int i = 2; i <= n ; i++){
			//get next number
			int next = prev + curr; 
			// set prev to current
			prev  = curr; 
			// current to next
			curr = next; 
		}
	
		return curr;
	}

}
