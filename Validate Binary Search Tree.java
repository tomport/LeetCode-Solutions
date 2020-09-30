class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root, null, null);
    }
    public boolean check(TreeNode node, Integer low, Integer high){
        if(node == null) return true;
        if(low != null && low >= node.val) return false;
        if(high != null && high <= node.val) return false;
        if(check(node.right, node.val, high) && check(node.left, low, node.val)) return true;
        return false;
    }
}