/*
Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false

Example 2:
Input: 1->2->2->1
Output: true
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode head2 = new ListNode(head.val);
        ListNode temp = head;
        ListNode temp2 = head2;
        while(head.next != null){
            head2.next = new ListNode(head.next.val);
            head = head.next;
            head2 = head2.next;
        }
        head = temp;
        head2 = temp2;
        ListNode prev = null;
        while(head != null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        while(head2 != null || prev != null){
            if(head2.val != prev.val){
                return false;
            }
            head2 = head2.next;
            prev = prev.next;
        }
        return true;
    }
}