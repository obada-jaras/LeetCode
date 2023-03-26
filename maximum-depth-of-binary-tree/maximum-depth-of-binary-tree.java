class Solution {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        findMaxDepth(root, 1);

        return maxDepth;
    }


    private void findMaxDepth(TreeNode node, int depth) {
        if (node == null) return;

        if (node.left == null && node.right == null)
            maxDepth = Math.max(maxDepth, depth);

        findMaxDepth(node.left, depth+1);
        findMaxDepth(node.right, depth+1);
    }
}