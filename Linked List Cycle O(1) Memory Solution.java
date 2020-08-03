public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        else{
            ListNode fast = head;
            ListNode slow = head;
            boolean first = true;
            while(fast != slow || first == true){
                if(fast == null || fast.next == null){
                    return false;
                }
                first = false;
                fast = fast.next.next;
                slow = slow.next;
            }
            return true;
        }
    }
}