/*
Esau B Medina 
Problem : Implement a Trie Prefix Tree that is used to store words and search for words/ 

* /


class Trie{

	// private node Constructor
	private class TrieNode{
		Map<Character, TrieNode> kids = new HashMap<>();
		boolean isEndOfWord = false; 
	}

	private TrieNode root; 

	// public constructor
	public Trie(){
		root = new TrieNode(); 

	}

	// Insert fuction 
	public void insert (String word){
		TrieNode curr = root;
		for(char c : word.toCharArray()){
			curr.kids.putIfAbsent(c, new TrieNode());
			curr = curr.kids.get(c);
		}
		curr.isEndOfWord = true; 
	}
		
	// search function 
	public boolean search(String word){
		TrieNode curr = root;
		for(char c : word.toCharArray()){
			if(!curr.kids.containsKey(c)){
				return false; 
			}
			curr = curr.kids.get(c);
		}
		return curr.isEndOfWord; 
	}	

	// prefix function 
	public boolean startsWith(String Prefix){
		TrieNode curr = root;
		for(char c : Prefix.toCharArray()){
			if(!curr.kids.containsKey(c)){
				return false; 
			}
			curr = curr.kids.get(c);
		}
		return true; 

	}

}
