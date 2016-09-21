package ict;

/**
 * Created by lon on 16-3-30.
 */
public class Solution101 {
     public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             public TreeNode(int x) { val = x; }
         }
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode node1,TreeNode node2) {
        if(node1==null && node2==null) return true;
        else if(node1==null || node2==null) return false;
        else if(node1.val!=node2.val) return false;
        return isSymmetric(node1.left,node2.right)&&isSymmetric(node1.right,node2.left);
    }

}
