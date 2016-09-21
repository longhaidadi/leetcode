package ict;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lon on 16-4-5.
 */
public class Solution145 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) { val = x; }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        backtracking(list,root);
        return list;
    }
    private void backtracking(List<Integer> curList,TreeNode root){
        if(root!=null){
            backtracking(curList,root.left);
            backtracking(curList,root.right);
            curList.add(root.val);
        }
    }
}
