
/*
	Esau B Medina
	Problem: Return the link list given to you with the removal of any duplicates within the list; 


	are we given the head of the list? is the list presorted or unsorted? 
		is the list using a standard link list class? 
			input is a list
				output is the sorted list



	
*/
class Solution {
	public ListNode deleteDuplicates (ListNode head){
		// step 1 & 2 set up iteratoin of list
		ListNode currentNode = head; 
	
		while (currentNode != null && currentNode.next != null ){
			if (currentNode.val == currentNode.next.val ){
				currentNode.next = currentNode.next.next; 
			}else{
				currentNode = currentNode.next; 
			}

			
		}


	 	//Since the current pointer did the work on the same list we can just 	
		return head;
	

	}
	
}
