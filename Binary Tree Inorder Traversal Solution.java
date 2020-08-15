class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List vals = new ArrayList<Integer>();
        if(root == null){ 
            return vals;
        }
        else{
            traverse(root, vals);
            return vals;            
        }
    }

    public void traverse(TreeNode node, List vals){
        if(node == null){
            return;
        }
        else{      
            traverse(node.left, vals);
            vals.add(node.val);
            traverse(node.right, vals);
        }
    }
}