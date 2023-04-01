/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {       
        return getTrees(1, n);    
    }
    
    private List<TreeNode> getTrees(int low, int high) {
        List<TreeNode> listOfTrees = new ArrayList<>();
        
        if (low > high) {
            listOfTrees.add(null);
            return listOfTrees;
        }
            
        for (int i = low; i <= high; i++) {
            List<TreeNode> leftTrees = getTrees(low, i-1);
            List<TreeNode> rightTrees = getTrees(i+1, high);
            
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    listOfTrees.add(root);
                }
            }
        }
        return listOfTrees;
    }
}