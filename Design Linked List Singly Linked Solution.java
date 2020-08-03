class MyLinkedList {
    private Node head = null;
    private int count = 0;
    class Node{
        int val;
        Node next;
        public Node(){
        }
        public Node(int x){
            this.val = x;
        }
        public Node(int x, Node nxt){
            this.val = x;
            this.next = nxt;
        }
    }
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || count-1 < index){
            return -1;
        }
        else{
            int temp = 0;
            Node cur = head;
            while(temp < index){
                cur = cur.next;
                temp++;
            }
            return cur.val;
        }
    }

    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        head = new Node(val, head);
        count++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
            int temp = 0;
            Node cur = head;
            if(head == null){
                addAtHead(val);
            }
            else{
                while(temp < count-1){
                    cur = cur.next;
                    temp++;
                }
                cur.next = new Node(val);
                count++;            
            }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);            
        }
        else if(index == count){
            addAtTail(val);
        }
        else if(index <= count){
            int temp = 0;
            Node cur = head;
            while(temp < index-1){
                cur = cur.next;
                temp++;
            }
            cur.next = new Node(val, cur.next);
            count++;            
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index == 0 && count == 1){
            head = null;
            count--;
        }
        else if(index == 0){
            head = head.next;
            count--;
        }
        else if(index < count){
            int temp = 0;
            Node cur = head;      
            while(temp < index-1){
                cur = cur.next;
                temp++;
            }
            if(cur.next.next != null){
                cur.next = cur.next.next;
            }
            else{
                cur.next = null;
            }
            count--;     
        }
    }
}