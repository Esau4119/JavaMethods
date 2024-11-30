
/*
Esau B Medina
Problem: Search a 2D matrix for the middle number of the matrix

	input : int[][] maxtrix and int target. 
	
		output: boolean if we have found that number

	ok so we are going to try and split up the search by using 2 pointers and moving them as we go along with our search. our right pointer will start at the end and our left will be at the beginning. 
	Since we have a sorted array we can do this, checking if we have number closer to the target number, if not we move our right pointer inward. if target is greater than the middle of our numbers then we can move the left pointer inward.  


*/

class Solution{
	public boolean searchMatrix(int[][] matrix, int target){

		int height = matrix.length;
		int width = matrix[0].length; 

		int left =0;
		int right = (height * width) -1;

		while(left <=right){
			int mid = (left +right)/2;
			int i = mid/width ; 
			int j = mid % width ; 
			int midNumber = matrix[i][j];
			if(target == midNumber){
				return true; 
			}else if(target < midNumber ){
				right = mid - 1; 
			}else{
				left = mid+1; 
			}
		
		}
		return false; 
	}


}
