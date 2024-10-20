/*
	Esau B Medina
		Problem: Given a list, determin if it contains a loop determin the pos since its not given. 
			input: link list;
				output: boolean

Fist thought would be to use a two pointer system. Both pointers start at the same position. However, one is moving at twice the speed. This would allow us to see if we have a cycle in the loop if both pointers end up on the same node before the “end” of the list. 

*/



class Solution {

	public boolean hasCycle (ListNode head){
		// Pointer set up. 
		ListNode pointers = new ListNode(); 
		pointers.next = head; 
		
		ListNode fasterP = pointers; 
		ListNode slowerP = pointers; 

		// If our fast moving pointer reaches the end, then we dont have a cycle.

		while(fasterP != null && fasterP.next != null ){
			// increment our pointers
			fasterP = fasterP.next.next; 
			slowerP = slowerP.next;

			if(fasterP == slowerP){
				return true; 
			}


		} 
		return false; 	
		

	

	}


}
