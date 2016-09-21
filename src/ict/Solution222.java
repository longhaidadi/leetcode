package ict;

/**
 * Created by lon on 16-8-4.
 */
public class Solution222 {
    public int countNodes(TreeNode root) {
        TreeNode temp = root;
        int height = -1;
        while (temp!=null){
            height++;
            temp=temp.left;
        }
        return count(root,height);
    }
    public int count(TreeNode node , int  height){
        if(node==null)return 0;
        int rightHeight = 1;
        TreeNode right = node.right;
        while (right!=null){
            right=right.left;
            rightHeight++;
        }
        if(rightHeight==height){
            return (1<<height)+ count(node.right,height-1);
        }else
            return (1<<(height-1))+count(node.left,height-1);

    }
}
