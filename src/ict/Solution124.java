package ict;

/**
 * Created by lon on 16-7-30.
 */
public class Solution124 {
    private int maxValue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        helper(root);
        return maxValue;
    }
    public int helper(TreeNode root){
        if(root==null)return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        maxValue = Math.max(maxValue,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
