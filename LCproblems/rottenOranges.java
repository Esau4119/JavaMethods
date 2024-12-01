
/*
Esau B Medina 
	Problem: Given an array of fresh and rotten oranges, return the number of minutes that it would take to turn all the fresh oranges rotten. 

	Ok so this will take a BFS search using a Queue linked list, we will traverse and add in all the rotton oranges, so that we can cycle throught the queue count the minutes and search in 4 directions from each rotten orange to turn the fresh ones rotton. 

	input: int[][] grid of oranges
		output: number of minutes if none then return -1 (integer)



*/
class Solution{

	public int orangesRotting(int[][] grid){
		// add in the rotton oranges to a queue
		int EMPTY =0, FRESH = 1, ROTTEN =2;
		int freshOnes= 0;

		Queue<int[]> oranges = new LinkedList<>();
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if (grid[i][j] == ROTTEN ){
					oranges.offer(new int[]{i,j});	
				}else if(grid[i][j] == FRESH){
					freshOnes++;
				}
			}			
		}
		// variables to count minutes
		 if (freshOnes == 0) return 0;
		int minutes = -1;
		int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
		// iterate throught the queue and search in 4 directions
		while(!oranges.isEmpty()){
			int qSize = oranges.size();
			minutes++;
			for(int k = 0; k < qSize; k++){
				int[] cords = oranges.poll();
				int i  = cords[0], j = cords[1];
				//direction search
				for(int[] direc: dir){
					int r = i + direc[0], c = j +direc[1];
					if(r >= 0&& r < grid.length&& c >=0 && c < grid[0].length && grid[r][c] == FRESH){
						grid[r][c] = ROTTEN;
						freshOnes = freshOnes-1; 
						oranges.offer(new int[]{r,c});
					}	
				}
			
		
		
			}

		}
		if(freshOnes == 0){
			return minutes; 
		}else{
			return -1; 
		}
	}
}
