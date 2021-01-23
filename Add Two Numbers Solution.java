/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 
Constraints:
The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        else{
            ListNode sums = new ListNode(0);
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            ListNode temp3 = sums;
            int carry = 0;
            while(temp1 != null || temp2 != null){
                if(temp1 != null && temp2 != null){
                    int sum = temp1.val + temp2.val + carry;
                    carry = sum / 10;
                    temp3.val = sum % 10;
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
                else if(temp1 != null){
                    int sum = temp1.val + carry;
                    carry = sum / 10;
                    temp3.val = sum % 10;
                    temp1 = temp1.next;
                }
                else{
                    int sum = temp2.val + carry;
                    carry = sum / 10;
                    temp3.val = sum % 10;
                    temp2 = temp2.next;                   
                }
                if(temp1 != null || temp2 != null){
                    temp3.next = new ListNode(0);
                    temp3 = temp3.next;                    
                }
            }
            if(carry == 1){
                temp3.next = new ListNode(1);
            }
        return sums;
        }    
    }
}