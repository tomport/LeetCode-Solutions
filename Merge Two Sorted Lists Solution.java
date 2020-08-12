class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        else{
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            ListNode merged = new ListNode();
            if(temp2 == null || (temp1 != null && temp1.val <= temp2.val)){
                merged = temp1;
                temp1 = temp1.next;
            }
            else{
                merged = temp2;
                temp2 = temp2.next;
            }
            ListNode temp3 = merged;
            while(temp1 != null || temp2 != null){
                if(temp1 != null && temp2 != null){
                    if(temp1.val <= temp2.val){
                        temp3.next = temp1;
                        temp1 = temp1.next;
                    }
                    else{
                        temp3.next = temp2;
                        temp2 = temp2.next;
                    }                            
                }
                else if(temp1 != null){
                    temp3.next = temp1;
                    temp1 = temp1.next;                 
                }
                else{
                    temp3.next = temp2;
                    temp2 = temp2.next;                   
                }
                temp3 = temp3.next;
            }
        return merged;
        }
    }
}