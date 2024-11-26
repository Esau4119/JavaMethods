
/*
Esau Bojorquez Medina 

Problem: Given an array of “coins”, return the minimum amount of coins needed to reach a target int
		input: array of coins and a target value; 

			output: int of minimum coins to get to target amount
		
coins = [1,2,5], amount = 11 
	output: 3 since 5+5+1
Ok so this question can be seen as a bottom up approach. Using an empty array of zeros we can determin the minimum amount of coins to get to each index all the way up to the “amount”. Making sure we get our smallest coins first once we reach the end we can return the last of our array if we successfully get to the last coin. 

*/
class Solution{
	public int coinChange(int[] coins, int amount){
		// create new array and fill with infinite numbers
		int[] dp = new int[amount+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		// enter first 0
		dp[0] = 0; 	

		// loop through the dp array and loop through coins everytime to check if 
		//current index - previous coin is not less than zero and if we dont have 
		// an infinite number 
		for(int i = 0; i <= amount; i++){
			for(int coin: coins){
				if(i - coin < 0){
					break; 
				}
				if(dp[i-coin] != Integer.MAX_VALUE){
					dp[i] = Math.min(dp[i], dp[i-coin]+1);
				}

			}
		}
		if(dp[amount] == Integer.MAX_VALUE){
			return -1;
		}else{
			return dp[amount];

		}

}


}
