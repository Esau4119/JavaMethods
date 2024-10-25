
/*
Esau B Medina

 	Problem: return the middle of a linked list; 

input: Head of a linked list
output: Middle node of linked list
EX [1,2,3,4,5]
	return [3,4,5]

*/

class Solution {
	public ListNode middleNode(ListNode head){
		// this problem asks for the use of a fast and slow pointer

		ListNode fast = head; 
		ListNode slow = head; 
		
		//SInce the fast pointer is moving twice as fast, we can get to the 
		//middle with the slow pointer
		//Iteration
		while (fast != null && fast.next != null){
			fast = fast.next.next; 
			slow = slow.next; 

		}	
		return slow; 

	}


}
