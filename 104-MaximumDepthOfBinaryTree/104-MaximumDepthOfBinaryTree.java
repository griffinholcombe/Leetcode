// Last updated: 5/26/2026, 11:18:20 AM
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
    public int maxDepth(TreeNode root) {
        int height = 0;
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }

        height += search(root);
        return height;
    }

    public int search(TreeNode current){
        if (current == null){
            return 0;
        }  else {
        int leftD = search(current.left);
        int rightD =search(current.right);

            if (leftD > rightD){
                return leftD + 1;
            } else {
                return rightD + 1;
            }
        }

    }
}