/*
	Esau B Medina
	Problem: Reverse a link list 
	Input would be the head of a linked list
	out put would be another list
	EX: 1 - 2 - 3 
		3 - 2- 1 
	First thought would be to iterate through the list, and set up 3 variables
		our previous, current and next. Much like swaping info between 2 variable we would need a third to hold our place while the switch happnes. 

set our previous to null, current to head and next to the next node
	then move previous to current, current to next and next to previous. 
		Do this unil we reach the end of list
*/

class Solution {
	public ListNode reverseList (ListNode head){
		ListNode prev = null; 
		ListNode Curr = head; 
		
		while(Curr != null ){
			ListNode next = Curr.next;
			Curr.next = prev; 
			prev = Curr; 
			Curr = next;
			 
		
		}
		return prev; 

	}
}
