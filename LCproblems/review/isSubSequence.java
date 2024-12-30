/*
* Esau Bojorquez Medina 
* Problem: given two arrays, determin if string s is a subsequence of string t

*/


class Solution {
	public boolean isSubsequence(String s, String t){
		//edge case
		if(s.length() == 0){
			return true; 
		} 
		boolean isSub = false;
		
 		int j = 0; // S pointer
		//everytime we see a matching letter we can increment j 
		for(int i = 0; i < t.length();i++ ){
  			if (i< t.length() && j < s.length()){
        			if(t.charAt(i) == s.charAt(j)){
        				j++; 
    	    			}
   			}

		}		
	
		if(j == s.length()){

			isSub = true; 
		}
		return isSub; 

	}

}
