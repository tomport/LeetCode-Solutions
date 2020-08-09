class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp;
        while(head != null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}