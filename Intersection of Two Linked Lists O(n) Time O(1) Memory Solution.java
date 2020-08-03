public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        else if(headA == headB){
            return headA;
        }
        else{            
            ListNode a = headA;
            ListNode b = headB;
            int aCount = 0;
            int bCount = 0;
            while(a != null){
                aCount++;
                a = a.next;
            }
            while (b != null){
                bCount++;
                b = b.next;
            }
            a = headA;
            b = headB;  
            if(aCount > bCount){
                for(int i = 0; i < aCount - bCount; i++){
                    a = a.next;
                }
            }
            else if (bCount > aCount){
                for(int i = 0; i < bCount - aCount; i++){
                    b = b.next;
                }                
            }
            while(a != b){
                if(a == null || b == null){
                    return null;
                }            
                a = a.next;
                b = b.next;
            }
            return a;
        }
    }
}