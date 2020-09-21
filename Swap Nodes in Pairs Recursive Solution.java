class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp1 = head.next.next;
        ListNode temp2 = head;
        head = head.next;
        head.next = temp2;
        head.next.next = swapPairs(temp1);
        return head;
    }
}