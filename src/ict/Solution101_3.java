package ict;

/**
 * Created by lon on 16-6-20.
 */
public class Solution101_3 {
    boolean isBalance = true;
    public boolean isBalanced(TreeNode root){
        if(root==null)return true;
        getDepth(root);
        return isBalance;
    }
    private int getDepth(TreeNode root){
        if(!isBalance)return -1;
        if(root==null){
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        root.val = Math.max(left,right)+1;
        isBalance = isBalance && Math.abs(left-right)<=1;
        return root.val;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE+1);
    }
}
