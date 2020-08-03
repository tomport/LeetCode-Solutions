class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return head;
        }
        else{
            ListNode temp = head;
            int count = 0;
            while(temp != null){
                temp = temp.next;
                count++;
            }
            if(count == n){
                head = head.next;
                return head;
            }
            else{
                temp = head;
                while(count > n + 1){
                    count--;
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                return head;
            }
        }
    }
}