

/*
Esau B Medina 
Problem: Given a 2d array of 1s and 0s, return the number of islands. All ones that are in connecting order up down left and right. 

	our input: 2d array of what? integers strings?? 
		output: we want an integer of the number of islands
			{{1}{0}{0}}
{{1}{0}{1}} = 2 islands?
			{{1}{0}{0}}
Ok so we of course would need to traverse through this grid with an height by width nested for loop. In that loop we can see if we have a 1. Using that we can do a dfs traversal around that 1 to retrive count all other 1s for the Island. But in order to keep from visiting again we can either keep a visted list or to save space, we can just turn the visited nodes into 0; 



*/
class Solution {
	
	

	public int numIslands(char[][] grid){
		// base edge case. 
		if (grid == 0 || grid[0].length == 0){
			return 0; 
		}


		// set up graph traverseal
		// look for 1s and call bfs 

		int islandCount = 0; 
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[0].length; j++){
				if (grid[i][j] == “1”){
					islandCount ++; 
					dfs(grid, i, j);
				}	
			}
		} 
	}
	
	public void dfs(char [][] grid, int i ,int j ){
		// set up bfs traversal 
		// turn the ones to “water” or zero 
		if (i < 0 || i >= grid.length || j >= grid[0].length || j < 0 && grid[i][j] !=  1){
			return; 
		}else{
			grid[i][j] = “0”;
			dfs(grid, i+1, j);// bottom 
			dfs(grid, i, j+1);//right
			dfs(grid, i, j-1);//left
			dfs(grid, i-1, j);//up
		}

	}
}
