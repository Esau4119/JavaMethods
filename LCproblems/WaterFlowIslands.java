
/*
Esau B Medina 
Problem: Given a 2d array of island heights, determin if water can flow from corrdantes to the “oceans”. only if they are equal or the lower height. 

we need to set up 2 deques	2 seens lists. 	
	add all edges of the oceans in to the deques and seens
		iterate through each of the deque entries and see if the offsets up down 
left and right are greater than that entry. 
		
This would call for a BFS search 
*/
import java.util.*; 
class Solution{
	public List<List<Integer>> pacificAtlantic(int[][] heights){
		List<List<Integer>> ans = new ArrayList<>();  
		if (heights == null || heights.length == 0 || heights[0].length == 0 ){
			return ans; 
		}

		// make 2 deques and 2 seen list
		Queue<int[]> paQue = new LinkedList(); 
		Queue<int[]> atQue = new LinkedList(); 
		
		boolean[][] paSeen = new boolean[heights.length][heights[0].length];
		boolean[][] atSeen = new boolean[heights.length][heights[0].length];;
		
		// Add in our ocean edges to queue and seens 
		// vertical edges
		for(int i = 0; i < heights.length;i++){
			paQue.add(new int[]{i,0});
			paSeen[i][0] = true; 
		
		}

		//horizontal edges
		for(int j = 0; j < heights[0].length;j++){
			paQue.add(new int[]{0,j});
			paSeen[0][j] = true; 
		
		}


		// vertical edges
		for(int i = 0; i < heights.length;i++){
			atQue.add(new int[]{i,heights[0].length-1});
			atSeen[i][heights[0].length-1] = true; 
		
		}

		//horizontal edges
		for(int j = 0; j < heights[0].length;j++){
			atQue.add(new int[]{heights.length-1,j});
			atSeen[heights.length-1][j] = true; 
		
		}
		// call bfs search for our oceans
		bfs(paQue, paSeen, heights);
		bfs(atQue, atSeen, heights);

		// collects our common paths that can reach the boths oceans

		for(int i = 0; i < heights.length; i++){
			for(int j = 0; j < heights[0].length; j++){
				if(paSeen[i][j] && atSeen[i][j]){
					ans.add(Arrays.asList(i,j));

				}
			}
		}


		return ans; 
	}
	public void bfs (Queue<int[]> queue, boolean[][] seens, int[][] heights){
	
		// right, left, up, and down
		int [][] offsets = {{1,0},{-1,0},{0,1},{0,-1}};

		// Cycle through our queue (BFS>

		while(!queue.isEmpty()){
			// not not empty we need to check the new coordinate and validate

			int[] currCell = queue.poll(); 
			int r = currCell[0];
			int c = currCell[1];

			for (int[] dir : offsets){
				int checkRow = r + dir [0];
				int checkCol = c + dir[1];
	
				//Bounds 
				if (checkRow >= 0 && checkRow < heights.length){
					if(checkCol >= 0 && checkCol < heights[0].length){
						// if next cell if greater and not in seen
						if(!seens[checkRow][checkCol] && heights[checkRow][checkCol] >= heights[r][c]){
							seens[checkRow][checkCol] = true;
							queue.add(new int[]{checkRow, checkCol});

							}	

					}

				}

			}


		}


	}



}
