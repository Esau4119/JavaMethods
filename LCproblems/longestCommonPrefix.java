/*
Esau Bojorquez Medina
	Problem is to find the longest common prefix; 
	is the prefix given? at the first index. integers or words? we return that prefix? 
	

*/


class Solution {
	public String longestCommonPrefix(String[] strs){
		String prefix = strs[0]; 
		

		// So we dont over iterate
		int minStr = Integer.MAX_VALUE; 	
		for (String minFinder : strs){
			if(minStr < minFinder.length()){
				minStr = minFinder.length(); 
			}
		}

		int j = 0;
		int letterNums = 0; 
		// Iterate over strs
		for(int i = 1; i < strs.length;i++ ){
	
		// iterate through each word
		while(j < minStr){
			if (strs[i].charAt(j) == prefix.charAt(j)){
				if (letterNums > j){
					letterNums = j; 
				}
					j++;

				} else{
					break; 
				}

			}

		}
		// Subtract letter num from main prefix 

		String leftOver = prefix.substring(0, letterNums); 

		return leftOver; 


	}


}
