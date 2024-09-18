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
    public static int Height(TreeNode root){
        if(root == null) return 0;
        return Math.max(Height(root.left) , Height(root.right))+1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int l = Height(root.left);
        int r = Height(root.right);

        return Math.abs(l-r)<=1 && isBalanced(root.left)  && isBalanced(root.right) ; 
        
    }
}
