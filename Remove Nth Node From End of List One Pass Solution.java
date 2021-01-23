/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Follow up: Could you do this in one pass?

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
 
Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return head;
        }
        else{
            ListNode ptr1 = head;
            ListNode ptr2 = head;
            for(int i = 0; i < n; i++){
                ptr1 = ptr1.next;
            }
            if(ptr1 == null){
                head = head.next;
                return head;
            }
            else{
                while(ptr1.next != null){
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                ptr2.next = ptr2.next.next;
                return head;   
            }
        }
    }
}