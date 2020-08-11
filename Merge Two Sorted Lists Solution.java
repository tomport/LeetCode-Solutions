class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        else{
            ListNode merged = new ListNode();
            if(l2 == null || (l1 != null && l1.val <= l2.val)){
                merged = l1;
                l1 = l1.next;
            }
            else{
                merged = l2;
                l2 = l2.next;
            }
            ListNode temp = merged;
            while(l1 != null || l2 != null){
                if(l1 != null && l2 != null){
                    if(l1.val <= l2.val){
                        temp.next = l1;
                        l1 = l1.next;
                        temp = temp.next;
                    }
                    else{
                        temp.next = l2;
                        l2 = l2.next;
                        temp = temp.next;
                    }                            
                }
                else if(l1 != null){
                    temp.next = l1;
                    l1 = l1.next;
                    temp = temp.next;                    
                }
                else{
                    temp.next = l2;
                    l2 = l2.next;
                    temp = temp.next;                    
                }
            }
        return merged;
        }
    }
}