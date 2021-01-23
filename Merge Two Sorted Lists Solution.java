/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

Example 1:
Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: l1 = [], l2 = []
Output: []

Example 3:
Input: l1 = [], l2 = [0]
Output: [0]
 
Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.
*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        else{
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            ListNode merged = new ListNode();
            if(temp2 == null || (temp1 != null && temp1.val <= temp2.val)){
                merged = temp1;
                temp1 = temp1.next;
            }
            else{
                merged = temp2;
                temp2 = temp2.next;
            }
            ListNode temp3 = merged;
            while(temp1 != null || temp2 != null){
                if(temp1 != null && temp2 != null){
                    if(temp1.val <= temp2.val){
                        temp3.next = temp1;
                        temp1 = temp1.next;
                    }
                    else{
                        temp3.next = temp2;
                        temp2 = temp2.next;
                    }                            
                }
                else if(temp1 != null){
                    temp3.next = temp1;
                    temp1 = temp1.next;                 
                }
                else{
                    temp3.next = temp2;
                    temp2 = temp2.next;                   
                }
                temp3 = temp3.next;
            }
        return merged;
        }
    }
}