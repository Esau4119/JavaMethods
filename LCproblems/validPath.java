
/*
Esau B Medina
Problem: given a bi direction al graph with n vertices, edges. determin if tehre is a path between source and destination
 ok so for input what are we getting? An int n, 2d int array edges, the source node, and destination 
	what do we give for output? a boolean if there is a valid path. 

	This is as stated seems to be a graph problem, so I want to try a a non traditional bfs with a stack. First we need to put the graph together with a map. Append the U to V and V to U. Then we need to keep track of all the seen variables with a set as we traverse the graph. with the stack we can add in each node that we come across as well as push to our seen set if we havent starting from our source. But before we go in to adding we check if the current node from the stack is the destination. This will loop until we have seen everything. 
*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
class Solution {
	public boolean validPath(int n, int[][] edges, int source, int destination){
		// If we start at destination we need to stop here
		if (source == destination){
			return true; 
		}
		// Make the graph	
		HashMap<Integer, List<Integer> graph = new HashMap();
		for(int edge : edges){
			graph.computeIfAbsent(edge[0], m -> ArrayList()).add(edge[1]);
			graph.computeIfAbsent(edge[1], m -> ArrayList()).add(edge[2]);
		}
		// Store seen and make stack starting both at source
		HashSet<Integers> seenList = new HashSet<>();		
		seenList.add(Source);

		Stack<Integer> trav = new Stack<>();
		trav.push(source); 
		
		while(!stack.isEmpty()){
			int topNode = trav.pop();
			if (topNode = destination){
				return true;
			}
			for (int nextNode: graph.getOrDefault(topNode, 
				Collections.emptyList())){
				if(!seenList.contain(nextNode)){
					seenList.add(nextNode);
					stack.push(nextNode);
				}		
			}
			return false;
		}
	}
}

