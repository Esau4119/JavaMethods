
/*
Esau B Medina

	Problem: given an array of points return the minimun cost to connect the points together

	input: 2d array of points; 
		output: integer of the min cost. 
	ok so this problem would make use of a min heap as we traverse through the points. Keeping track of the lowest cost to our movements. 


*/

class Solution{

	public int minCostConnectPoints(int[][] points){
		int total =0; 
		
		boolean[] visited = new boolean[points.length];
		PriorityQueue<int[]> minHeap = new PriorityQueue<>(
			Comparator.comparingInt(cost -> cost[0]));

		minHeap.offer(new int[]{0,0});


		while(!minHeap.isEmpty()){
			int[] pair = minHeap.poll();
			int cost = pair[0];
			int point = pair[1];

			if(visited[point] == true){
				continue; 
			}
	
			visited[point] = true; 
			total = total + cost; 
			for(int i = 0; i < points.length; i++){
				if(visited[i] == false){
					int newCost = Math.abs(points[point][0]- points[i][0])+  Math.abs(points[point][1]- points[i][1]);

					minHeap.offer(new int[]{newCost, i});

				}
			}		


			
		}
		return total; 
	}

}
