public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }

    void helper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#/");
            return;
        }
        sb.append(root.val).append("/");
        helper(root.left, sb);
        helper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    int idx =0;
    public TreeNode deserialize(String data) {
        if (data.length() == 0)
            return null;
        idx = 0;
        String arr[] = data.split("/");
        return build(arr);
    }

    TreeNode build(String arr[]) {
        if (arr[idx].equals("#")) {
            idx++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[idx]));
        idx++;
        root.left = build(arr);
        root.right = build(arr);
        return root;
    }
}