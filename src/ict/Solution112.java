package ict;

/**
 * Created by lon on 16-5-9.
 */
public class Solution112 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        node.left=left;
        new Solution112().hasPathSum(node,3);
    }
    public boolean hasPathSum(TreeNode root, int sum) {

        return helper(root,sum);
    }
    private boolean helper(TreeNode root ,int sum){
        if(root==null)return false;

        if(root.left==null && root.right==null)
            if(sum==0)return true;
        else{
                if(root.left!=null)
                    if(helper(root.left,sum-root.val))return true;
                if(root.right!=null)
                    if(helper(root.right,sum-root.val))return true;
            }
        return false;

    }
}
