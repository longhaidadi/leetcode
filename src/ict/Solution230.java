package ict;

/**
 * Created by lon on 16-8-4.
 */
public class Solution230 {

    public int kthSmallest(TreeNode root, int k) {
        int leftCount = countNode(root.left);
        if(leftCount<=k)return kthSmallest(root.left,k);
        else if(k>leftCount+1){
            return kthSmallest(root.right,k-1-leftCount);
        }
        return root.val;

    }
    private int countNode(TreeNode root){
        return root==null?0:countNode(root.left)+countNode(root.right)+1;
    }
}
