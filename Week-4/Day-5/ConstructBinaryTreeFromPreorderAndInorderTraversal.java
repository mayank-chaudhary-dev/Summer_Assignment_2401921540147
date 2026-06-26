class Solution {
    int preidx=0;
    HashMap<Integer,Integer>map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        int instart=0;
        int inend=inorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,inorder,instart,inend);
    }

    public TreeNode build(int[] preorder, int[] inorder,int instart,int inend){
        if(instart>inend) return null;
        int rootidx=map.get(preorder[preidx]);
        TreeNode root=new TreeNode(preorder[preidx++]);
        root.left=build(preorder,inorder,instart,rootidx-1);
        root.right=build(preorder,inorder,rootidx+1,inend);
        return root;
    }
}