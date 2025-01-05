/*
	Esau B Medina
	Problem: given two strings determin if t is an anagram of s. 


*/

import java.util.HashMap;
class Solution{
	public boolean isAnagram ( String s, String t){
		HashMap<Character,Integer> anaRefS = new HashMap<Character,Integer>();
		HashMap<Character,Integer> anaRefT = new HashMap<Character,Integer>();
		

		// store our references for the anagram check
		for(int i = 0; i < s.length(); i++){
			// store every char in ref
			anaRefS.put(s.charAt(i),  anaRefS.getOrDefault(s.charAt(i), 0) + 1);	
		}
	
		// store our references for the anagram check
		for(int i = 0; i < t.length(); i++){
			// store every char in ref
			anaRefT.put(t.charAt(i), anaRefT.getOrDefault(t.charAt(i), 0) + 1));	
		}
		System.out.println(anaRefS);
		System.out.println(anaRefT);
		if(anaRefS.equals(anaRefT)){
			return true; 
		}

		return false; 
	}

}
