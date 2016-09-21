package ict;

/**
 * Created by lon on 16-5-4.
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
