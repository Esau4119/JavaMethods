
/*
Esau B Medina

Problem: Generate Parenthese, given a num of pairs, generate all combination of parantheses. 

	Ok so for all combinations, we will use revcursive backtracking. This will allow us to go down the answer tree and give us every possible combination. 

*/


class Solution{
	public List<String> generateParenthesis(int n ){
		// ans list
		List<String> ans = new ArrayList<>();

		// call helper dfs
		backT(0,0,””,n,ans );
		return ans; 

	}
	private void backT (int opens, int closed, String build ,int pairs, List<String> ans){
		if(opens == closed && opens +closed == pairs*2){
			ans.add(build);
			return;
		}	

		if(opens < pairs ){
			backT (opens + 1, closed, build+ “(”,pairs, ans);
		}
		if(closed < opens ){
			backT (opens , closed + 1, build + “)”,pairs, ans);
		}

	}

}
