
/*
	*Esau B Medina
*	problem: given an array return the greatest max profit

*	just integers, what are we returning? are the arrays sorted? 
*	ok so my first thought is to loop through our array and check each profit, 
*while recording the max number we see. 
	
	

*/

class Solution{
	public int maxProfit (int[] prices){
		
		int maxP = 0; 
		int minP = Integer.MAX_VALUE;


		for(int i = 0; i < prices.length; i++){
			int buy = prices[i]; 
			if(buy < minP ){
				minP = buy;
			}

			int sell = buy - minP;

			if ( sell > maxP){
				maxP = sell; 
			}	
		}

		return maxP; 
		
	}


}
