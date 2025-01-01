
/*
	*Esau B Medina
*	problem: given an array return the greatest max profit
	

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
