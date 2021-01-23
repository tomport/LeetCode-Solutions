/*
Given an m x n 2d grid map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Example 2:
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3

Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
*/

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