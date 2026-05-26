// Last updated: 5/26/2026, 12:14:29 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        dfs(root, result);

        return result;
    }

    public void dfs(TreeNode root, List<Integer> list){
        if (root == null) return;

        list.add(root.val);
        
        dfs(root.left, list);

        dfs(root.right, list);

    }
}