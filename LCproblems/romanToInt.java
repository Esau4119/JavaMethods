
/*
Esau B Medina
problem: Roman numeral to roman integer. 
Given a string of roman numerals, return the number as an integer. 
what return a interger

* /


import java.util.HashMap;
class Solution{

	public int romanToInt (String s){
		// Storing our numerals and values
		HashMap <Character, Integer> nums = new HashMap <Character, Integer>(); 
		nums.put('I', 1);
		nums.put('V',5);
		nums.put('X',10);
		nums.put('L',50);
		nums.put('C',100);
		nums.put('D',500);
		nums.put('M',1000);
		
       		int total = 0;
        	int i = 0;
        	while (i < s.length()) {

			// case with number 4 of IV where i is less than i +1 
			// s = "MCMXCIV"

            		if(i < s.length()-1 && nums.get(s.charAt(i)) < nums.get(s.charAt(i+1))){
				// Subtract the greater from least
				int lessthanCase =  nums.get(s.charAt(i+1))-nums.get(s.charAt(i));
				total = total + lessthanCase ;

				// Increment 2 since we used both already 
             			i=i+2; 

            		}else{

                		total = total + nums.get(s.charAt(i)) ;
                		i++;
            		}


        	}

		return total; 
		
	}
}
