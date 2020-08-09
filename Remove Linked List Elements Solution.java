class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        else{
            ListNode newHead = new ListNode(0,head);
            head = newHead;
            while(head.next != null) {
                if(head.next.val == val) {
                    head.next = head.next.next;
                } 
                else {
                head = head.next;
                }
            }
            return newHead.next;
        }
    }
}