
/*
Esau B Medina

Problem: Given a list of integers that have stone weights at each index, choose the 2 heaviest and combine them. If they are equal to eachother then both are equal two zero
if they have a difference then subtract both weights. 

This problem would make great use of a max heap. 
	no strings just integers 
		max heap give us a O (log n) for adding and removing objects at the top but linear time for specific objects 

*/

import java.util.PrioityQueue; 
class Solution {

	public int lastStoneWeight(int[] stones){
		
		//creating our max heap with comparing a and b ording with max values first 
		PriorityQueue<Integer> weights = new PriorityQueue<>((a,b)-> 
		Integer.compare(b,a));
		

		// enter weights with for each loop
		for (int weight : stones){
			weights.offer(weight);

		}

		// Now that we have the weights in we can compare them
		// equal weight means we set to zero
		// difference means we subtract max from min
		// since we need to keep the last element we would close at > 1
		while(weights.size > 1){
			int topOne = weights.poll();
			int topTwo = weights.poll();

			if(topOne != topTwo){
				int diff = topOne - topTwo;
				weights.offer(diff); 
			}


		}
		if (weights.isEmpty()){
			return 0; 
		}

		return weights.peek(); 

	}


}
