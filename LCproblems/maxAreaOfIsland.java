/*
Esau B Medina 
	Problem: given a 2d array of 0s and 1s return the max area of an island. a group of 1s in 4 directional ways are considered islands. 

ok so for a graph problem we can traverse through the grid with a height by width nested loop. Everytime we see a 1 we can call to a helper function called dfs. We would search the area around the 1 we found and count the times we see a 1. Returning this to our main loop, we can keep track of the max area that we see. 

*/

class Solution{
	public int maxAreaOfIsland(int[][] grid){
		//base empty case
			if(grid == null || grid.length ==0 ){
				return 0; 
			}
		// create max 
		int maxArea = 0; 
		int height = grid.length; 
		int width = grid[0].length;

		//set up main traversal
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				if(grid[i][j] == 1){
					maxArea = Math.max(maxArea, dfs(grid, i, j));
				}
			}
			
		}
		return maxArea; 
	}

	public int dfs (int[][] grid, int i, int j){
		// base case of bounds and not 1
		if(i < 0 || j< 0 || i >= grid.length || j >= grid[0].length ||grid[i][j] != 1 ){
			return 0; 
		}
		grid[i][j] = 0;
		int area = 1; 
		area += dfs(grid, i-1, j);// up
		area += dfs(grid, i+1, j);// down
		area += dfs(grid, i, j+1);// right
		area += dfs(grid, i, j-1);//left

		return area; 
	}

}
