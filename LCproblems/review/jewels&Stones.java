/*
	Esau B Medina 
	Problem: given two strings, one represents jewels and the other is the pile of stones; Return the amount of jewels within the pile of stones

	
*/


import java.util.HashSet;
class Solution{
	public int numJewelsInStones(String jewels, String stones){
		HashSet<Character> jewelsRef = new HashSet<Character> ();

		// Store our references in the set
		for(int i = 0; i < jewels.length(); i++){
			jewelsRef.add(jewels.charAt(i));
		}


		int jewelNums = 0; 
		//Search pile of stones; 
		for(int i = 0; i < stones.length(); i++){
			//if we see a stone up our counter
				if(jewelsRef.contains(stones.charAt(i))){
					jewelNums ++; 
				}
		}
		return jewelNums ; 
		
	}

}
