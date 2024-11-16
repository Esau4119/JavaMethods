/*Esau B Medina
	Problem : Given a total number of courses and an array of prerequisites return if we are able to take the courses without hitting a prerequisite 

		input: 2d array of integers
				and total int of courses
		output: boolean 
				exp: {{0,1}{1,2}{2,0}} = false; 
ok so this is definitly a graph problem, so more than likely we would be making use of a dfs or bfs. The example shows that we are trying to detect a cycle. So a dfs would best suite this problem. 

	First we should create our graph with a map connecting the nodes to each other
		then we can initialize our “states” being unvisited, visiting, and done
using these we can keep track of the classes we are “taking” and have taken, so when traverseing we see a class that is in the visiting state, we would have our cycle.  

*/ 
class Solution{
	public boolean canFinish( int numCourses, int[][]  prerequisites){
		// bild our graph

		Map<Integer, List<Integer>> graph = new HashMap<>(); 
		for(int[] classes : prerequisites){
			graph.computeIfAbsent(classes[0], pre -> new ArrayList<>()).add(classes[1]);
		}
		// States 
		int unVisited = 0; 
		int visiting = 1; 
		int done = 2;
		int[] states = new int[numCourses];

		// now we can set up base traverseral one one loop since classes are from 
		// 0tp numCourses
		for(int i = 0; i< numCourses; i++){
			if (!dfs(graph,i,states)){
				return false; 
			}
		}
 
		return true; 
	}
	
	// Helper dfs function
	public boolean dfs(Map<Integer, List<Integer> > graph, int node, int[] states){
		if(states[node] == 1){// run into cycle if we see a 1
			return false; 
		}
		if(states[node]== 2 ){// classes is complete so we are good
			return true;

		}
		


		states[node]= 1; 
		if(graph.containskey(node)){
			for(int nextNodes : graph.get(node)){
				if(!dfs(graph,nextNodes ,states)){
					return false; 
				}
			}
		}
		states [node] = 2; 
		return true;
	}
}
