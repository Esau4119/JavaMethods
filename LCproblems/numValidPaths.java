
/*
	Esau B Medina
		Problem: given a 2d graph, determine how many valid path between 0,0 and m-1,n-1 are only uising down and right. 
		input: 2 integers being m and n or height and width of a graph. 

			output: integer of number of paths

ok so this is problem of counting the number of ways, using a dp bottom up appoarach is going to be the most effecient. 
	first we need to create the grid with the numbers provided, then we can use it as a table, counting the cells from the sums of the cells to the left and up of each on. this will give us our final number of ways we can get to the finish 

	



*/
class Solution{
	public int uniquePaths(int m, int n ){
		// create the grid
		int[][]  dp = new int[m][n];

		
		// now we can traverse and sum up the cells
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				if (i ==0 && j== 0){
					dp[i][j] = 1; 
				}else{

					int topNum = 0; 
					int bottomNum = 0; 
					if(i > 0 ){
						topNum  = dp[i-1][j] ;
					}

					if(j > 0){
						bottomNum  =  dp[i][j-1];
					}

					dp[i][j] = topNum  + bottomNum ;
				}	
			}		
		}
		return dp[m-1][n-1] ;
	}	
}
