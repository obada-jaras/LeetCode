class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checkIfSymmetric(root.left, root.right);
    }

    private boolean checkIfSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;

        return checkIfSymmetric(left.left, right.right) && checkIfSymmetric(left.right, right.left);
    }
}
