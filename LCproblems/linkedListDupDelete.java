
/*
	Esau B Medina
	Problem: Return the link list given to you with the removal of any duplicates within the list; 


	are we given the head of the list? is the list presorted or unsorted? 
		is the list using a standard link list class? 
			input is a list
				output is the sorted list


	I will take the head of the list
		iterate through and check if the next node is equal to the current node
			if we have a duplicate, we need to remove
				since linked lists are connected with node pointers, we would just need to 				have our current node link to the next node after the first next node 1 - 1-2 					would turn into 1 - 2 ; 

	
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
