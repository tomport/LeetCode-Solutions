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