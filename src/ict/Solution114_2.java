package ict;

/**
 * Created by lon on 16-6-20.
 */
public class Solution114_2 {
    public void flatten(TreeNode root) {
        helper(root);
    }
    private void helper(TreeNode root){
        if(root==null)return ;
        helper(root.left);
        if(root.left!=null){
            root.left.right=root.right;
            root.right=root.left;
        }
    }
    public void swap(TreeNode left ,TreeNode right){

        TreeNode tmp = left;
        left = right;
        right = tmp;
    }
}
