class Solution {
    private class Node {
           int x;
           int y;
           public Node(int x, int y) {
               this.x = x;
               this.y = y;
           }
    }

    public int numIslands(char[][] grid) {
        if(grid == null){
            return 0;
        }
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    check(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void check(char[][] grid, int i, int j){
        if(grid[i][j] != '1'){
            return;      
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i, j));
        while(!queue.isEmpty()){
            i = queue.peek().x;
            j = queue.remove().y;
            if(i < grid.length && i >= 0 && j < grid[0].length && j >= 0 && grid[i][j] == '1'){
                grid[i][j] = '0';
                queue.add(new Node(i+1, j));
                queue.add(new Node(i, j+1));
                queue.add(new Node(i-1, j));
                queue.add(new Node(i, j-1));
            }    
        }
    }
}