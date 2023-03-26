// "Top-down" Solution
//class Solution {
//    int maxDepth = 0;
//
//    public int maxDepth(TreeNode root) {
//        findMaxDepth(root, 1);
//
//        return maxDepth;
//    }
//
//    private void findMaxDepth(TreeNode node, int depth) {
//        if (node == null) return;
//
//        if (node.left == null && node.right == null)
//            maxDepth = Math.max(maxDepth, depth);
//
//        findMaxDepth(node.left, depth+1);
//        findMaxDepth(node.right, depth+1);
//    }
//}



// "Bottom-up" Solution
class Solution {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root);
    }

    private int findMaxDepth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = findMaxDepth(node.left);
        int rightDepth = findMaxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}