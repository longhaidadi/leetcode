package ict;

/**
 * Created by lon on 16-3-29.
 */
public class Solution110 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public int getHeight(TreeNode node){
        if(node==null)return 0;
        node.val=Math.max(getHeight(node.left),getHeight(node.right))+1;
        return node.val;
    }

    public boolean isBalanced(TreeNode root) {
        getHeight(root);
        return isBalanced1(root);
    }
    public boolean isBalanced1(TreeNode root) {
        if(root==null) return true;
        int val1 = root.left==null?0:root.left.val;
        int val2 = root.right==null?0:root.right.val;
        if(Math.abs(val1-val2)>1) return false;
        return isBalanced1(root.right) && isBalanced1(root.left);
    }

}
