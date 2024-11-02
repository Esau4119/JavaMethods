
/*
Esau B Medina
Problem: Given a network of n nodes and a list of 2d array of times. They contain the source node, target node, and a weight to get to target. Return the minimum time it takes to for all nodes to recieve a signal. 

Graph problem 
	we need to build a the graph with a hashmap
	use a min heap to track all of the visited nodes along with their min path cost.

Along with saving all of the lower times in a separte map with 


cycle through heap and check if we have seen that node before
if not we add that to our separate map 

graph is used to view the nodes in the network format
min heap is used to keep lowest time it takes to get to each node
min time map is used to save the visited and their min time
	also to compare if we have visited the same number of given nodes. 
	
*/
import java.util.*; 

class Solution{
	public int networkDelayTime(int[][] times, int n, int k){
		// Building the graph network
		HashMap<Integer, List<int[]>> graph = new HashMap<>(); 
		for(int[] time: times){
			int source = time[0], target= time[1], weight = time[2];
			graph.computeIfAbsent(source, next -> new ArrayList<>()).add(new 
			int[]{target,weight});

		}
		// Create Min Heap out of prioity queue
		PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(entry -> entry[1]));
		// add in first value
		minHeap.add (new int[]{k,0});
		HashMap<Integer, Integer> minTimes = new HashMap<>();
		// Iterate over heap and add more nodes we see if we havent seen them
		while (!minHeap.isEmpty()){
			int[] curr = minHeap.poll();
			int node = curr[0];
			int time = curr[1];
			if(minTimes.containsKey(node)){
				continue; 
			}
			minTimes.put(node,time);
			if(graph.containsKey(node)){
				for(int[] nextNodes : graph.get(node)){
					int next = nextNodes[0];
					int nextTime= nextNodes[1];
					if (!minTimes.containsKey(next)){
						minHeap.add(new int[]{next, time + nextTime});
					}
				}
	
			}
	
		}

		if (minTimes.size() == n){
			return Collections.max(minTimes.values());
		}else{
			return -1;
		}
	}
}
