
/*
Esau B Medina
 Problem: given an array of integers an operations, return the sum after the given operations. Baseball Game
Ok so this would  make greate use of a stack since we are doing things in order. 
	input: string array
	output : int of the sum
		
		if int add into stack
		if + add the previous two and add into stack
		if D multiply last score by 2 and add into stack
		if C remove last score

*/
class Solution{
	public int calPoints(String[] operations){
		Stack<Integer> ans = new Stack<>(); 
		for(String toDo : operations){
			if(toDo.equals(“+”)){
				int top=  ans.pop(); 
				int newInt= ans.peek() + top;
				ans.push(top);
				ans.push(newInt);
			}else if(toDo.equals(“D”)){
				int doubScore = ans.peek() *2; 
				ans.push(doubScore);
			}
			else if(toDo.equals(“C”)){
				ans.pop(); 
			}else{
				int newInt = Integer.parseInt(toDo);
				ans.push(newInt );
			}
		}		
		// grab sum 
		int total =0; 
		while(!ans.isEmpty()){
			total += ans.pop();
		}
		return total; 
	}
}
