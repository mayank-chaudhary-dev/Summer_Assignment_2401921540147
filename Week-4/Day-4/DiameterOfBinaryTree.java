class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return max;
    }
    int find(TreeNode root){
        if(root==null) return 0;
        int l=find(root.left);
        int r=find(root.right);
        if(l+r>max) max=l+r;
        return 1+Math.max(l,r);
    }
}