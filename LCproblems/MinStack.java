
/*
Design a stack class that supporst push pop top and gets the min of the stack

ok so to optimally gain the min of the stack, we will keep track of the lowest number by only pushing lower numbers. 
*/

import java.util.Stack;
	public class MinStack{
		private Stack<Integer> stk;
		private Stack<Integer> minStk;

		public MinStack(){
			stk = new Stack<>();
			minStk= new Stack<>();
		}
	
		public void push(int num){
			stk.push(num);
			if(minStk.isEmpty()|| num < minStk.peek()){
				minStk.push(num);

			}else{
				minStk.push(minStk.peek());
			}

		}

	public void pop (){
		stk.pop();
		minStk.pop();
	}
	
	public int top(){
		int top = stk.peek(); 	
		return top; 
	}

	public int getMin(){
		int top = minStk.peek(); 
		return top; 
	}

}
