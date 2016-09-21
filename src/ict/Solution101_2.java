package ict;

/**
 * Created by lon on 16-6-20.
 */
public class Solution101_2 {
    public boolean isBalanced(TreeNode root){
        if(root==null)return true;
        getHeight(root);
        return helper(root);
    }
    private boolean helper(TreeNode root){
        if(root==null)return true;
        else if(root.left==null && root.right!=null){
            return root.right.val<=1;
        }else if(root.right==null && root.left!=null)
            return root.left.val<=1;
        return helper(root.left)&&helper(root.right);
    }
    private int getHeight(TreeNode root){
        if(root==null)return 0;
        if(root.left==null && root.right==null) {
            root.val=1;
        }
        else if(root.left==null&& root.right!=null){
            root.val=root.right.val+1;
            return root.val;
        }else if(root.right==null && root.left!=null){
            root.val=root.left.val+1;
        }else {
            root.val=Math.max(getHeight(root.left),getHeight(root.right))+1;
        }
        return root.val;

    }
}
