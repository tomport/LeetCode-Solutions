/*
Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]

Constraints:
The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        else{
            ListNode slow = head;
            ListNode fast = head;
            int size = 0;
            while(slow != null){
                slow = slow.next;
                size++;
            }
            slow = head;
            k = k % size;
            while(k > 0 && fast != null){
                fast = fast.next;
                k--;
            }
            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = head;
            head = slow.next;
            slow.next= null;
            return head;
        }
    }
}