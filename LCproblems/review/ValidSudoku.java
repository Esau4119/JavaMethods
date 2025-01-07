/*
Esau B Medina
Problem given a 2d array board validate sudoku board
	rules, contain digits 1-9 without rep on both row and column
		each 3x3 needs to have 1-9 without rep

	are we only looking to see if it breaks these rules? 
	what do we return
	
*/
import java.util.HashSet; 
class Solution{
	public boolean isValidSudoku (char[][] board){
		// validate our rows
		for(int i = 0; i < 9; i++){
		HashSet<Character> seen = new HashSet<>();
			for(int j = 0; j < 9; j++){
				if(seen.contains(board[i][j]) ){
					return false; 
				}else if(board[i][j] != ‘.’){
					seen.add(board[i][j]);	
				}
			}
		}
		//validate our columns
		for(int i = 0; i < 9; i++){
			HashSet<Character> seen = new HashSet<>();
			for(int j = 0; j < 9; j++){
				if(seen.contains(board[j][i]) ){
					return false; 
				}else if(board[j][i] != ‘.’){
					seen.add(board[j][i]);
				}
			}
		}
		// validate our 3x3
	   	int[][] starts = {{0, 0}, {0, 3}, {0, 6},
                          {3, 0}, {3, 3}, {3, 6},
                          {6, 0}, {6, 3}, {6, 6}};

		for (int[] startPoint : starts){
			// ex: startpoint = {0,0}
			HashSet<Character> seen = new HashSet<>();
			for(int row = startPoint[0]; row < startPoint[0] +3; row++){
				for(int col= startPoint[1]; col< startPoint[1] +3; col++){
					if(seen.contains(board[row][col]) ){
						return false; 
					}else if(board[j][i] != ‘.’){
						seen.add(board[row][col]);	
					}
				}
			}
		}
 		return true; 	

	}

}
