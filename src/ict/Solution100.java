package ict;

/**
 * Created by lon on 16-3-31.
 */
public class Solution100 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        else if(p==null || q==null) return false;
        int val1 = p.val;
        int val2 = q.val;
        if(val1!=val2)return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
