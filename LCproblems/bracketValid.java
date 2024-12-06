
/*
	Esau B Medina 
Problem: Given a string contianing brackets and parenthesis determin if a input is valid; 

input: string
	output: boolean


*/
class Solution{

	public boolean isValid(String s){
		HashMap<Character, Character> map = new HashMap<>();
		map.put(‘}’,’{’);
		map.put(‘)’,’(’);
		map.put(‘]’,’[’);

		Stack<Character> stack = new Stack<>(); 

		for(Character brac: s.toCharArray()){
			if(!map.containsKey(brac)){
				stack.push(brac);
			}else{
				if(stack.isEmpty()|| stack.pop() != map.get(brac)){
					return false; 
				}
			}

		}
		return stack.isEmpty(); 

	}

}
