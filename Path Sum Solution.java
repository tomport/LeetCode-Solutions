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