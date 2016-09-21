package ict;

/**
 * Created by lon on 16-3-30.
 */
//没有到叶子节点则返回整形最大值,方便将回溯推向有叶子节点的方向遍历
public class Solution111 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) { val = x; }
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left==0) left=Integer.MAX_VALUE;
        if(right==0) right=Integer.MAX_VALUE;
        return Math.min(left,right)+1;

    }
}
