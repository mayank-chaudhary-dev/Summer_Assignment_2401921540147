class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        find(root);
        return maxsum;
    }
    int find(TreeNode root){
        if(root==null) return 0;
        int l=find(root.left);
        int r=find(root.right);
        maxsum=Math.max(maxsum,Math.max(root.val,Math.max(root.val+l+r,root.val+Math.max(l,r))));
        return Math.max(root.val+Math.max(l,r),root.val);
    }
}