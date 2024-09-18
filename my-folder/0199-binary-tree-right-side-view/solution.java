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
    public static void PrintRightView(TreeNode curr , int level , List<Integer> lst){
        if(curr == null) return ;
        if(level == lst.size() ){
            lst.add(curr.val);
        }

        PrintRightView(curr.right , level+1 , lst);
        PrintRightView(curr.left , level+1 , lst);

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        PrintRightView(root , 0 , ans);
        return ans;
    }
}
