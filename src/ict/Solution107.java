package ict;

/**
 * Created by lon on 16-6-20.
 */
import java.util.*;

public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>>results = new ArrayList<>();
        if(root==null)return results;
        helper1(root,results);
        Collections.reverse(results);
        return results;
    }
    private void helper1(TreeNode root,List<List<Integer>>results){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer>list = new ArrayList<>();
            for(int i = 0;i<len;i++){
                TreeNode data = queue.poll();
                if(data.left!=null)
                    queue.add(data.left);
                if(data.right!=null)
                    queue.add(data.right);
                list.add(data.val);
            }
            results.add(list);
        }
    }
    private void helper2(TreeNode root,List<List<Integer>>results,int level){
        if(root==null)return;
        if(level>=results.size()){
            results.add(new ArrayList<Integer>());
        }
        results.get(level).add(root.val);
        helper2(root.left,results,level+1);
        helper2(root.right,results,level+1);
    }

}
