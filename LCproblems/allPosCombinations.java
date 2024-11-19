/*
Esau B Medina

	Problem: Given n and k, with n being a range from 1-n and k is the number of cobinations  return all possible combinations with no repeats
	input: 2 ints k and n 
		output: Array of Lists of size k 
		ex: given n 4 and k2 
			{{1,2}{1,3}{1,4}{2,3}{2,4}{3,4}}

Ok so this problem can make use of a DFS recursive search. We will keep track of a small set of “solution” and a bigger sets of our solutions. 
 

*/

class Solution{
	public List<List<Integer>> combine (int n , int k ){
		// make our storage
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> sol = new ArrayList<>();

		backTrack(n, k , result, sol);

		return result; 
		

	}
	public void backTrack(int n, int k, List<List<Integer>> results,List<Integer> sol){
		// Since we want k in our combination we can use that as a base case
		if(sol.size() == k){
			results.add(new ArrayList(sol));
			return;
		}
			
		// checking if we have less than that in our sol
		if(n > k - sol.size()){
			backTrack(n-1,k,results, sol);
		}
		// add in elements and continue backtracking 

		sol.add(n);
		backTrack(n-1, k, results, sol);
		sol.remove(sol.size()-1);
		
	}

}
