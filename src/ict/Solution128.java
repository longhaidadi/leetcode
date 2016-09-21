package ict;

/**
 * Created by lon on 16-6-21.
 */
public class Solution128 {
    private int sum = 0;
    public int sumNumbers(TreeNode root){
        if(root==null)return 0;
        helper(root,root.val);
        return sum;
    }
    public void helper(TreeNode root,int curSum){
        if(root==null)return;
        if(root.left==null && root.right==null){
            sum = curSum*10+root.val;
            return;
        }
        root.val=curSum*10+root.val;
        helper(root.left,root.val);
        helper(root.right,root.val);
    }
}
