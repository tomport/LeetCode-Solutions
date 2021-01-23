/*
Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false

Example 2:
Input: 1->2->2->1
Output: true

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle = head;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            middle = middle.next;
            temp = temp.next.next;
        }
        ListNode prev = null;
        while(middle != null){
            temp = middle.next;
            middle.next = prev;
            prev = middle;
            middle = temp;
        }
        while(prev != null){
            if(prev.val != head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}