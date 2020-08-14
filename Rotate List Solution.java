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