package ict;

/**
 * Created by lon on 16-5-5.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ret = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        if(root==null)return ret;
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer>l = new ArrayList<>();
            while (size>0){
                TreeNode t = q.poll();
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                size--;
                l.add(t.val);
            }
            if(!l.isEmpty())ret.add(l);
        }
        return ret;
    }
}
