/*
Esau B Medina 
Problem: given points where each index has x and y, return the k closest points to the origin 0,0
	input: we get a 2d array with 2 points in each index
		output we are returning k in an array? 
			ex: Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]

ok so this seems like it would benefit from a heap, specificaly a max heap. We can enter our cords distances into the heap and have it sort them for us. We can then loop through and retrieve the k amount we need. Lastly just turn that into our answer array. 

*/
import java.util.PriorityQueue;
class Solution {

	public int[][] kClosest(int[][] points, int k ){
		// make heap and enter distances storing the indexes [1,2] for exp
		PriorityQueue<int[]> distances = new PriorityQueue <>(
			(a,b) -> {
				int distA = a[0]*a[0] + a[1] * a[1];
				int distB = b[0]*b[0] + b[1] * b[1];
				// since we need a max heap we invert the compare
				return Integer.compare(distB, distA);
			}); 

		// loop through heap and take out/add until we have k amount
		for(int[] pair : points){
			distances.offer(pair);
			if(distances.size() > k){
				distances.poll();
			}
		}

		
		// turn heap into 2d array and return
		int[][] ans = new int[k][2];

		for(int i = 0; i < k; i++ ){
			ans[i] = distances.poll();
		}

		return ans; 
	}


}
