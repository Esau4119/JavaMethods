

/*
Esau B Medina
	Problem: Given 2 strings return the longest common subsequence
input: 
This problem will be using a 2d array that will have the length of both strings
we will track the longest by comparing and increasing from the previous longest. 	
*/


class Solution {
	public int longestCommonSubsequence( String text1, String text2){
		int row = text1.length(); 
		int col = text2.length(); 

		int[][] tracker = new int[row+1][col+1];
		
		for(int i = 1; i <= row; i ++){
			for(int j = 1; j <= col; j++){
				if(text1.charAt(i-1)== text2.charAt(j-1) ){
					tracker[i][j] = tracker[i-1][j-1]+1;
				}else{
					tracker[i][j] = Math.max(tracker[i-1][j],tracker[i][j-1]);
				}
			}

		}

		return tracker[row][col];
	}
}
