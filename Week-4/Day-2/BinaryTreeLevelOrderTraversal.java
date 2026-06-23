class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int lsize=q.size();
            List<Integer>ans=new ArrayList<>();;
            while(lsize>0){
                TreeNode f=q.remove();
                ans.add(f.val);
                if(f.left!=null) q.add(f.left);
                if(f.right!=null) q.add(f.right);
                lsize--;
            }
            res.add(ans);
        }
        return res;
    }
}