/*
	Esau B Medina 
		Problem: given a string return the amount of times we can construct the word balloon. 
		input: String 
			output: integer
		ex: nlaebolko
			output: 1; 
Ok so we will save our balloon into string array so that we can set up a counter with a hashmap. As we traverse the given text, if we see a balloon char then we can increment that and put it into the map. once we have all the letters, we can return the minimum out of all the letters in the map. this will give us the amount of times we can fully make balloon. 
*/
class Solution{
	public int maxNumberOfBalloons(String text){
		// Create Map
		HashMap<Character, Integer> letters = new HashMap<>();
		String key = “balloon”;
		// Check text for key letters and increment if we see one
		for(Character letter : text.toCharArray()){
			if(key.indexOf(letter) != -1 ){
				letters.put(letter, letters.getOrDefault(letter, 0)+1);
			}
		}
		// if we missing letter then we cant if so then we return the min
		if(!letters.containsKey(b)||
			!letters.containsKey(a)||
			!letters.containsKey(l)||
			!letters.containsKey(o)||
			!letters.containsKey(n)){
				return 0; 

		}else{
		return Math.min(Math.min(letters.get(b), letters.get(a)),Math.min(letters.get(l)/2, Math.min			(letters.get(o)/2, letters.get(n))));

		}
		
	}


}
