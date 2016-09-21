package ict;

/**
 * Created by lon on 16-5-9.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Solution113 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> l = new ArrayList<>();
        helper(l,new LinkedList<Integer>(),root,sum);
        return l;
    }
    public void helper(List<List<Integer>>list,LinkedList<Integer> path,TreeNode root,int sum){
        if(root==null)return;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==sum){
                List<Integer> l = new ArrayList<>(path);
                list.add(l);
            }
        }else{
            if(root.left!=null)
                helper(list,path,root.left,sum-root.val);
            if(root.right!=null)
                helper(list,path,root.right,sum-root.val);
        }
        path.removeLast();
    }
}
