
class Solution {
    List<Integer> result = new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return result;

        dfs(root);

        return result;
    }

    private void dfs(TreeNode node) {
        result.add(node.val);
        
        if (node.left != null) 
            dfs(node.left);
        
        if (node.right != null) 
            dfs(node.right);
    }
}
