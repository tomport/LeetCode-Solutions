class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
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
            vals.add(node.val);
            traverse(node.left, vals);
            traverse(node.right, vals);
        }
    }
}