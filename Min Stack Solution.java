/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Example 1:
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 
Constraints:
Methods pop, top and getMin operations will always be called on non-empty stacks.
*/

class MinStack {
    private List<Integer> data;

    public MinStack() {
        data = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        data.add(x);
    }
    
    public void pop() {
        data.remove(data.size()-1);
    }
    
    public int top() {
        return data.get(data.size()-1);
    }
    
    public int getMin() {
        if(data.size() == 1){
            return data.get(0);
        }
        int temp = data.get(0);
        for(int i = 1; i < data.size(); i++){
            if(data.get(i) < temp){
                temp = data.get(i);
            }
        }
        return temp;
    }
}