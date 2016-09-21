package ict;

/**
 * Created by lon on 16-5-5.
 */
public class Solution108 {
    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    private TreeNode helper(int [] number,int left ,int right){
        if(left>right)return null;
        int mid = left + ((right-left)>>1);
        TreeNode root = new TreeNode(number[mid]);
        root.left=helper(number,left,mid-1);
        root.right=helper(number,mid+1,right);
        return root;
    }
}
