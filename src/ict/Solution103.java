package ict;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lon on 16-4-5.
 */
public class Solution103 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        getList(ret,root,true);
        return ret;
    }
    public void getList(List<List<Integer>> list , TreeNode root,boolean isleft2Right){
        if(root==null)return ;
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){
            Stack<TreeNode> stack1 = new Stack<>();
            List<Integer> tmp =new ArrayList<>();
            while (!stack.isEmpty()){
                TreeNode node = stack.pop();
                tmp.add(node.val);
                if(isleft2Right) {
                    if (node.left != null)
                        stack1.add(node.left);

                    if (node.right != null)
                        stack1.add(node.right);
                }else{
                    if (node.right != null)
                        stack1.add(node.right);
                    if (node.left != null)
                        stack1.add(node.left);
                }
            }
            isleft2Right =!isleft2Right;
            list.add(tmp);
            stack=stack1;
        }

    }

    private void helper2(ict.TreeNode root,List<List<Integer>>results,int level){
        if(root==null)return;
        if(level>=results.size()){
            results.add(new ArrayList<Integer>());
        }
        results.get(level).add(root.val);
        if(level%2==1) {
            helper2(root.left, results, level + 1);
            helper2(root.right, results, level + 1);
        }else{
            helper2(root.right, results, level + 1);
            helper2(root.left, results, level + 1);
        }
    }
}
