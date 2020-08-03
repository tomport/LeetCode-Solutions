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