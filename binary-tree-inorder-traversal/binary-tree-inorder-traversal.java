
class Solution {
    List<Integer> result = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }

        dfs(root);

        return result;
    }

    private void dfs(TreeNode node) {
        if (node.left != null) {
            dfs(node.left);
        }

        result.add(node.val);

        if (node.right != null) {
            dfs(node.right);
        }
    }
}
