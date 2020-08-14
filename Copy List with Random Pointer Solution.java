class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        else{
            Map<Node,Node> copy = new HashMap<Node,Node>();
            Node temp = head;
            while(temp != null){
                copy.put(temp, new Node(temp.val));
                temp = temp.next;
            }
            temp = head;
            while(temp != null){
                copy.get(temp).next = copy.get(temp.next);
                copy.get(temp).random = copy.get(temp.random);
                temp = temp.next;
            }
            return copy.get(head);
        }
    }
}