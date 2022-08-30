class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        return tsearch(root , subRoot) || isSubtree(root.right , subRoot)                       ||isSubtree(root.left , subRoot);
    }
    public boolean tsearch(TreeNode r, TreeNode s){
        if(r == null && s == null)return true;
        if(r == null || s == null)return false;
        
        if(r.val != s.val) return false;
        return tsearch(r.left , s.left) && tsearch(r.right , s.right);
    }
}
