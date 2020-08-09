class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        else{
            ListNode headEven = head.next;
            ListNode tempEven = headEven;
            ListNode tempOdd = head;
            while(tempEven != null && tempEven.next != null){
                tempOdd.next = tempEven.next;
                tempOdd = tempOdd.next;
                tempEven.next = tempOdd.next;
                tempEven = tempEven.next;
            }
            tempOdd.next = headEven;
            return head;
        }
    }
}