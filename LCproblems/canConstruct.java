


/*
Esau B Medina 
	Problem: Given two strings return true if a can be constructed by using letters from b and false otherwise. 

	input: string a and b 
		output: boolean 

		ok so we are going to use a hashmap as a counter for our letters in B. Adding to the value if we have repeating characters. Then we can loop through the A string and look up our char in B if we have more than 1 in there we can subtract it. Else we dont have a matching string and we can call false; 



*/


import java.util.HashMap;
class Solution{
	public boolean canConstruct(String ransomeNote, String magazine){
		// make map
		HashMap<Character, Integer> letters = new HashMap<>();
		for(char letter: magazine.toCharArray()){
			letters.put(letter, letters.getOrDefault(letter, 0)+1);
		}
		
		// loop through ransome
		for(char letter: ransomeNote.toCharArray()){
			if(letters.getOrDefault(letter, 0)> 0 ){
				letters.put(letter, letters.getOrDefault(letter,0)-1);
			}else{
				return false; 
			}
		}
		return true; 
	}	

}
