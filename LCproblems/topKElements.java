
/*
Esau B Medina
Problem: given a list of integters and int k, determine the top k elments that appear the most frequent; 


	just integers? can we assume we always have integers; what if we get k = 0; 

	what type of solution are we looking for? we can do o(n) or o(nlogk) 

	ok so for O(nlogk), we can make use of a min heap or piority queue.

*/
import java.util.*;
class Solution {
	public int[] topKFrequent (int[] nums, int k ){
		// first we need to set up a map tracking our nums and 
		// frequencys
		HashMap<Integer, Integer> elemFreq = new HashMap<>();
		for(int i = 0; i < nums.length; i++ ){
			elemFreq.put(nums[i], elemFreq.getOrDefault(nums[i],0)+1);

		}
		// then we can set up a min heap
		PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(	
			(elem1, elem2) -> Integer.compare(elem1.getValue(), elem2.getValue())
		);

		// as we loop through we add in our entries from the map, 
		// the min heap will take care of of keeping the top k
		// we add in an entry and pop the very top
		// if the new entry is the next greatest it will not be removed only the 
		//k+ 1 will be
		for(Map.Entry<Integer,Integer> element : elemFreq.entrySet()){
			if (minHeap.size() < k ){
				minHeap.offer(element);

			}else{
				minHeap.offer(element);
				minHeap.poll();
			}


		}

		
		// now we need to grab our elements out of the min heap
		int[] ans = new int[k];
		for (int i = 0; i < k; i++){
			ans[i] = minHeap.poll().getKey();
		}
		return ans; 
	} 

}
