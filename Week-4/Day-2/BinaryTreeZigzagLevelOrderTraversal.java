class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int c=0;
        while(q.size()>0){
            int lsize=q.size();
            c++;
            List<Integer>ans=new ArrayList<>();;
            while(lsize>0){
                TreeNode f=q.remove();
                ans.add(f.val);
                if(f.left!=null) q.add(f.left);
                if(f.right!=null) q.add(f.right);
                lsize--;
            }
            if(c%2==0) rev(ans);
            res.add(ans);
        }
        return res;
    }
    void rev(List<Integer>ans){
        int i=0;
        int j=ans.size()-1;
        while(i<j){
            int temp=ans.get(i);
            ans.set(i,ans.get(j));
            ans.set(j,temp);
            i++;j--;
        }
    }
}