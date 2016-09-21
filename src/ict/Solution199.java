package ict;

/**
 * Created by lon on 16-8-1.
 */
import java.util.ArrayList;
import java.util.List;
public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>ret = new ArrayList<>();
        helper(root,ret,0);
        return ret;
    }
    public void helper(TreeNode root,List<Integer>ret , int curDepth){
        if(root==null)return;
        if(ret.size()==curDepth){
            ret.add(root.val);
        }
        helper(root.left,ret,curDepth+1);
        helper(root.right,ret,curDepth+1);
    }
}
