/*
Esau B Medina 
	Problem: Given a phone with letters attached to each of the numbers and given a string of digits, return all combinations of letters from the given digits. 
		Ok so we are going to be using backtracking and a hashmap for this problem
create answer array and check if we have digits
Create number map with numbers as key and letters as value
make string builder path maker
create backtracking function
check if we have reached the end of our digits string
if not we get the letters from our map
loop through the letters and append to the current path
backtrack and delete to get other possiblities. 
*/
class Solution {
	public List<String> letterCombinations(String digits){
		List<String> ans = new ArrayList<>(); 
		if(digits.isEmpty()){
			return ans; 
		}
		HashMap<Character, String> map = new HashMap<>(); 
		map.put(2 , abc);
		map.put(3 , def);
		map.put(4 , ghi);
		map.put(5 , jkl);
		map.put(6 , mno);
		map.put(7 , pqrs);
		map.put(8 , tuv);
		map.put(9 , wxyz);
		StringBuilder path = new StringBuilder(); 
		dfsBT(digits,0, path, map, ans);
		return ans; 
	}

	private void dfsBT(String digits, int index,StringBuilder path,Map<Character, String> map,List<String> ans){
		if(index == digits.length()){
			ans.add(path.toString());
			return; 
		}
	
		String letters = map.get(digits.charAt(index));
		for(char letter: letters.toCharArray() ){
			path.append(letter);
			dfsBT(digits, index+1, path, map, ans);
			path.deleteCharAt(path.length()-1);
		}	
	}

}
