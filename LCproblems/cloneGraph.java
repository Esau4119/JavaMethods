/*
Esau B Medina
	Problem: Clone a graph given a starting point node. 
	What happens if we get a null node?, 
		input: starter node,
			output: starter node of new graph
			cant send original graph back and has to be in the same order
ok so this graph problem could make use of a stack for a BFS search. We would end up with about an O(n) for time and same for space. 

	first we make a map of all the nodes along with their copy of a new node with the same value;
	then we start up our stack, iterate through and create the nodes that we see and havent visited ( we need a visited set)
	lastly we can iterate through the full map and view the connections of the neighbors on the OG map, then connect the created nodes to those new nodes with the same value; 


*/
import java.util.*;
class Solution {

	public Node cloneGraph(Node node){
		if (node == null){
			return null; 
		}
		// Initialize the map
		HashMap<Node, Node> connector = new HashMap<>();



		//set up bfs with stack
		Stack<Node> search = new Stack<>();
		Set<Node> visited = new HashSet<>();
		search.add(node);
		visited.add(node);

		while(!search.isEmpty()){
			Node curr = search.pop();
			connector.put(curr, new Node(curr.val));

			for(Node nextNode: curr.neighbors){
				if(!visited.contains(nextNode)){
					visited.add(nextNode);
					search.add(nextNode);
				}
			}
		}
		
		// connect full map with neighbors		
		



		for(Map.Entry<Node,Node> pair : connector.entrySet()){
			// get the old node
			//set the new nodes neighbors

			Node old = pair.getKey();
			Node newer = pair.getValue();
			for(Node nexts : old.neighbors){
				newer.neighbors.add(connector.get(nexts));
			}
		}

		return connector.get(node);

	}	

}
