
/*
	Esau B Medina
	Problem: Group Anagram, given a list of strings, return all the anagrams that match each other as a list in any order. 
	input: list of strings
		output list of lists of strings . 
Ok so for this problem we are going to be using a hashmap to store the unicode of our anagrams. This way we can scann the rest of our strings to test if they are going to be grouped together. 

*/
class Solution{
	public List<List<String>> groupAnagrams(String[] strs){

		HashMap<String, List<String>> groups = new HashMap<>();
		
		for(String word: strs){
			// alphabet code for word
			int[] uniCode = new int[26];
			for(char letter: word.toCharArray()){
				//increment the letter index to mark we have it
				uniCode[letter- a ] ++; 
			}
			
			// make this a tuple so we can store it as a key
			StringBuilder key = new StringBuilder(); 
			for(int num: uniCode){
				key.append(#).append(num);
			}
			String wordKey = key.toString(); 
			System.out.println(wordKey);
			groups.computeIfAbsent(wordKey, x -> new ArrayList<>()).add(word);
		}
		List<List<String>> ans = new ArrayList<>(groups.values());
		return ans; 
	}


}
