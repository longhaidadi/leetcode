package ict;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lon on 16-5-12.
 */
public class Solution129 {
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    private int helper(TreeNode treeNode, int sum){
        if(treeNode==null)return 0;
        sum = sum *10 + treeNode.val;
        int left = helper(treeNode.left,sum);
        int right = helper(treeNode.right,sum);
        if(left+right==0)return sum;
        return left+right;
    }

}
