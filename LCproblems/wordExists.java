
/*
Esau B Medina 
	
	Problem: Given a board with letters and a word string, determin if the word can be made within the board. Can Be made in sequental adjacent cellts horz or vert cant use cell more than once.  
 Ok so since this is a graph problem I am thinking we should be doinga DFS search with the board at each of our indexes. 
		input : 2d array board and string word 
			output: boolean if we can make the word in the conditions


*/
class Solution {
	public boolean exist (char[][] board, String word){
		// base case of board and word being empty	
		if (word.size() >board.length*board[0].length){
			return false;
		}
           

		if(board.length == 1 || board[0].length == 1){
			return board[0][0] == word.charAt(0);
		}
	
		// variables 
		boolean[][] visited = new boolean[board.length][board[0].length];
	 
		// graph traverse for i and j 
		for(int i = 0; i < board.length; i ++){
			for(int j = 0; j < board[0].length;j ++){
				if(dfs(board, word, i, j , 0, visited)){
					return true;
				}

			}

		}
 		return false;

	} 
	public boolean dfs (char[][] board,String word, int i,int j,int index,boolean[][] visited ){
		if (index == word.length()){
			return true; 
		}

		// set up bounds
		if(i < 0|| j < 0 || i >= board.length || j >= board[0].length|| visited[i][j]|| board[i][j] != word.charAt(index)){
			return false; 
		}
		visited[i][j] =true; 
		boolean found = dfs(board, word, i-1 , j, index+1, visited)|| // up
		dfs(board, word, i+1 , j, index+1, visited)||//down
		dfs(board, word, i , j-1, index+1, visited)||// left
		dfs(board, word, i , j+1, index+1, visited) ;//right
		visited[i][j] = false; 
		return found; 
		
	
	}
}