package ict;

/**
 * Created by lon on 16-6-20.
 */
public class Solution101_1 {
   public boolean isBalanced(TreeNode root){
       if(root==null)return true;
       return isBalanced(root.left)&&isBalanced(root.right)&&(Math.abs(depth(root.left)-depth(root.right))<=1);
   }
    private int depth(TreeNode root){
        if(root==null)return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }
}
