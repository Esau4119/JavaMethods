/*
Esau B Medina 
	Problem: given a matrix, rotate the grid 90 degrees. 
	input: we are geting an size nxm matrix 
	output: the same matrix just rotated
	any restriction? no new matrix
	ex: 123	741
	    456 ->	852
           789	963
	ok so for this we can think of linear algebra and see the steps to manipulate a matrix
	The first part would be a transpose and the second part would be a reflection
	this would achieve the rotation of 90 degrees


*/
class Solution {
	public void rotate(int[][] matrix){
		int mLen = matrix.length; 
		

		// transpose
		for(int i = 0; i < mLen; i++){
			for (int j = i+1; j < mLen; j++){
				int swap = matrix[i][j];
				matrix[i][j] = matrix[j][i];
 				matrix[j][i] = swap;
			}

		}

		// reflect 
		for(int i = 0; i < mLen; i++){
			for (int j = 0; j < mLen/2; j++){
				int swap = matrix[i][j];	
				matrix[i][j] = matrix[i][mLen-j-1];
				matrix[i][mLen-j-1] = swap;
			}
		}
	}

}
