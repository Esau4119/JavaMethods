/*
Esau B Medina

problem is subsequence: given two strings return true or false if t is s is a subsequence of t. 

	no integers? just strings? what is the time complexity we are looking for? nothing is sorted? 

ok so instead of using a hashmap, i will be using a semi 2 pointer approach. I will set 2 incrememnters and we move one along the test subject. If we see any characters that are equal to the pointer in the model string, then we can increment. At the end we can check if our incrementer is the same length as our string model. This will tell us that we have seen all characters in the test string. 
*/

class Solution{
	public boolean isSubsequence (String s, String t){
		// empty string edge case
		if (s.length() == 0 ){
			return true; 
		}

		int i =0, j = 0; 

		while (i < t.length()){

			if(j <s.length() && i < t.length()){
    				if( s.charAt(j) == t.charAt(i)){
          				  j++;
    				} 
			}
		
			i++;
		}
		return j == s.length(); 
		

	s}


}
