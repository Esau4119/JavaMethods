import java.util.HashSet;
class Solution{

	public int lengthOfLongestSubstring(String s){
		// set up hashSet
		HashSet<Character> seenList = new HashSet<>();

		// make our left and right pointer
		int left = 0; 
		int longest =0; 
		// iterate throught the array
		for(int right = 0; right < s.length(); right++){
			// check if we seen the char at right in s 
			while(seenList.contains(s.charAt(right))){
				seenList.remove(s.charAt(left));
				left++;
			}
			// update max and add to seenList
			longest = Math.max(longest, (right-left)+1);
			seenList.add(s.charAt(right));
			
		}
		return longest; 


	}

}
