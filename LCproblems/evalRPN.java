/*
Esau B Medina
problem: Given a array of strings, that repesent REverse Polish Notation
 		return the integer that represents the value of the expression 
	input: string array of ints
		output: int
*/


class Solution{
	public int evalRPN (String[] tokens){
		Stack<Integer> stk = new Stack<>();

		for(String op : tokens ){
			if(op.equals(+)||op.equals(-)||op.equals(*)||op.equals(/)){
				int num2 = stk.pop(); 
				int num1 = stk.pop(); 

				if(op.equals(+)){
					stk.push(num1+num2);
					continue;
				}
				if(op.equals(-)){
					stk.push(num1-num2);
					continue;
				}
				if(op.equals(*)){
					stk.push(num1*num2);
					continue;
				}
				if(op.equals(/)){
					double div = (double) num1/num2; 
					if(div < 0){
						int divAns =(int) Math.ceil(div);
						stk.push(divAns);
					}else{
						int divAns =(int) Math.floor(div);
						stk.push(divAns);
					}	
					continue;
				}

			}else{
				stk.push(Integer.parseInt(op));
			}

		}
		return stk.pop(); 

	}

}
