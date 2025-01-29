/*
Esau B Medina
	Problem: merge two sorted lists

input: 2 sorted linked lists 
	output: one sorted lists with same nodes
		ex: 1 - 2 -3
`			1 - 1 4 
		1 - 1 - 1- 2- 3-4 

*/		


class Solution{
	public ListNode mergeTwoLists (ListNode list1, ListNode list2){
		ListNode starter = new ListNode(0); 
		ListNode curr = starter; 
		// traversal between both lists
		while(list1 != null && list2 != null ){
			// first condition to see which has a lower number
			if( list1.val < list2.val ){
				// add that lower number to semi new list; 
				curr.next = list1; 
				// increment the list1 pointer
				list1 = list1.next;
				
			}else{
				// if 2 is lower then we add to list
				curr.next =list2; 
				//increment the list2 pointer
				list2 = list2.next;
			}

			// move down to make room for more nodes
			curr = curr.next; 
	
		}

		//append the rest of the lists
		if (list1 == null){
			curr.next = list2; 
		}else{
			curr.next = list1; 
		}


		//Starter.next holds our head
		return starter.next;

	}



}
