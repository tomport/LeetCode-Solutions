class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle = head;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            middle = middle.next;
            temp = temp.next.next;
        }
        ListNode prev = null;
        while(middle != null){
            temp = middle.next;
            middle.next = prev;
            prev = middle;
            middle = temp;
        }
        while(prev != null){
            if(prev.val != head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}