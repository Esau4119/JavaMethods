

/*
Esau B Medina 
	Problem: given a integer of total number of coursed and a list of prerequisites, return the ordering of courses you should take to finish all courses. 
		input: we get a integer and we get an array of requirements

			output: give back an array that has the order in which to take the classes. 

*/


class Solution{
	public int[] findOrder(int numCourses, int[][] prerequisites){
		// answer array
		int[] finalOrder = new int[numCourses];
		int[] inDegree = new int[numCourses];

		// create the map
		Map<Integer, List<Integer>> classTree = new HashMap<>();
		for(int[] pre: prerequisites){
			classTree.computeIfAbsent(pre[1], mainClass -> new ArrayList<>()).add(pre[0]);
			inDegree[pre[0]]+= 1; 
		}
		// Make the queue
		Queue<Integer> classList = new LinkedList<>();
		for(int i = 0; i < numCourses; i++){
			if(inDegree[i] == 0){
				classList.offer(i);
			}
	
		}

		// traverse it with queue/linkedList
		int index = 0; 
		while(!classList.isEmpty()){
			// get top element
			int curr = classList.poll();
			finalOrder[index++] = curr; 
			// get the order of the next 
			if (classTree.containsKey(curr)){
				for(int nextNode: classTree.get(curr)){
					inDegree[nextNode] -= 1; 
					if(inDegree[nextNode]  == 0){
						classList.offer(nextNode);
					
					}
				}
	
			}

		}
		if(index == numCourses){
			return finalOrder; 
		}else{
			return new int[0]; 
		}
	}
}
