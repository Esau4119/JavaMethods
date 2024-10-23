Esau B Median
	Problem: Given a 2d array of intervals, merge any overlap with in the list; 

		input: 2d array of intervals
			output: new list of intervals with no over lap;
				ex: [[1,3][2,6]] → [[1,6]]
		ofc we will need to iterate through this 2d array with nested loops
		 check if the second index of current interval is greater than the next interval’s first index; so if [x,y] we check if y1 is greater than x2. This will tell us if we have an overlap. so if we add x1 with y2 that would fix the overlap with a fesh interval. and we can add that to the list. If we do not see then we can just add the current interval to the list; 
*/
import java.util.* ;
class Solution{
	public int[][] merge (int[][] intervals){
		if(intervals.length == 0){
			return new int[0][0];
		}
		
		// Since the intervals may not be sorted we would need to sort them by 
		//start time; 
		Arrays.sort(intervals, (x,y) -> Integer.compare(x[0],y[0])); 
		
		// now we iterate and change the overlaps
		List<int[]> mergeList = new ArrayList<>();

		for(int[] pair : intervals){
			if(mergeList.isEmpty() || mergeList.get(mergeList.size()-1)[1] < pair[0]){
				mergeList.add(pair);
				}else{
					// here we are running into overlap since the y1 of last 
					//merged is greater than x2 of the current pair we are 
					//seeing. so we update the last merged’s y to fix the 
					//interval.

 					mergeList.get(mergeList.size()-1)[1] = Math.max( 
					mergeList.get(mergeList.size()-1)[1], pair[1]) ;
				}
		} 
		
		int[][] finalProd = mergeList.toArray(new int[mergeList.size()][]);

		return finalProd; 
	}

}
