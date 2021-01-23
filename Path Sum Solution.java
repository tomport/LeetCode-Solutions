/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: false

Example 3:
Input: root = [1,2], targetSum = 0
Output: false

Constraints:
    The number of nodes in the tree is in the range [0, 5000].
    -1000 <= Node.val <= 1000
    -1000 <= targetSum <= 1000
*/

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null && sum == 0){
            return false;
        }
        boolean hasSum = hasSum(root, sum, 0);
        return hasSum;
    }

    public Boolean hasSum(TreeNode root, int sum, int curSum) {
        if(root == null){
            return false;
        }
        curSum += root.val;
        if(root.left == null && root.right == null && curSum == sum){
            return true;
        }
        boolean leftCheck = hasSum(root.left, sum, curSum);
        boolean rightCheck  = hasSum(root.right, sum, curSum);
        if(leftCheck || rightCheck){
            return true;
        }
        else{
            return false;
        }
    }
}