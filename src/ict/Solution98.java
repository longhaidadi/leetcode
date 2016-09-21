package ict;

/**
 * Created by lon on 16-5-4.
 */
public class Solution98 {
    public static void main(String[] args) {

    }
    TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
       if(root!=null){
           if(!isValidBST(root.left))return false;
           if(pre!=null && pre.val>=root.val)return false;
           pre=root;
           return isValidBST(root.right);

       }
        return true;
    }

}
