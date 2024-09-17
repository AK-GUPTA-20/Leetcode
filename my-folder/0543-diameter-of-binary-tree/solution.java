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
    int ans = 0;
    public  int Height(TreeNode root){
        if(root == null) return 0;
        int HL = Height(root.left);
        int HR = Height(root.right);

        ans = Math.max(ans , HL+HR);

        return Math.max(HL,HR)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Height(root);

        return ans;
    }
}
