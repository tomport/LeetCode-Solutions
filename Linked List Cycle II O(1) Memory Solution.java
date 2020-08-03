public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        else{
            ListNode fast = head;
            ListNode slow = head;
            boolean first = true;
            while(fast != slow || first == true){
                if(fast == null || fast.next == null){
                    return null;
                }
                first = false;
                fast = fast.next.next;
                slow = slow.next;
            }
            while(slow != head){
                head = head.next;
                if(head == slow){
                    break;
                }
                slow = slow.next;
            }
            return head;
        }
    }
}