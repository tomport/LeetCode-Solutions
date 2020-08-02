public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        else{
            ListNode fast = head.next;
            ListNode slow = head;
            while(fast != slow){
                if(fast == null || fast.next == null){
                    return false;
                }
                fast = fast.next.next;
                slow = slow.next;
            }
            return true;
        }
    }
}