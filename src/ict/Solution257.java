package ict;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by lon on 16-3-29.
 */
public class Solution257 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){val=x;}
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        if(root!=null) getPath(root,"",ret);
        return ret;
    }

    private void getPath(TreeNode node ,String path,List<String>paths){
        if(node.left==null && node.right==null) {
            paths.add(path);
        }else if(node.left!=null){
            getPath(node.left,path+"->"+node.left.val,paths);
        }else if(node.right!=null){
            getPath(node.right,path+"->"+node.right.val,paths);
        }
    }
    public void test(){
        TreeNode root = new TreeNode(1);
        binaryTreePaths(root);
    }

    public static void main(String[] args) {
        Solution257 solution257 = new Solution257();
        solution257.test();
    }
}
