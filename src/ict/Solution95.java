package ict;

/**
 * Created by lon on 16-7-30.
 */
import java.util.ArrayList;
import java.util.List;
public class Solution95 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> list = new ArrayList<>();
        return list;
    }
    public List<TreeNode> helper(int start , int end){
        List<TreeNode> list = new ArrayList<>();
        if(start>end){
            list.add(null);
            return list;
        }
        for (int i = start; i <=end ; i++) {
            List<TreeNode> left = helper(start, i - 1);
            List<TreeNode> right = helper(i + 1, end);
            for(TreeNode leftSubTree:left){
                for(TreeNode rightSubTree:right){
                    TreeNode root=new TreeNode(i);
                    root.left=leftSubTree;
                    root.right=rightSubTree;
                    list.add(root);
                }
            }
        }
        return list;
    }

    public List<TreeNode> helper1(int start , int end){
        List<TreeNode> list = new ArrayList<>();
        if(start>end){
            list.add(null);
            return list;
        }
        for (int i = start; i <end ; i++) {
            List<TreeNode> left = helper1(start, i - 1);
            List<TreeNode> right = helper1(i+1,end);
            for (TreeNode l : left){
                for (TreeNode r : right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        List<TreeNode>list = new ArrayList<>();
        list.add(null);
        System.out.println(list.size());
        for(TreeNode root : list) System.out.println(root);
    }
}
