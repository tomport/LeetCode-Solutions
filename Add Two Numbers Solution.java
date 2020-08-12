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