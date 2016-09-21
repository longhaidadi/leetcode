package ict;

/**
 * Created by lon on 16-5-12.
 */
public class Solution116 {
    class TreeLinkNode{
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;
        int val;
        TreeLinkNode(int v){val=v;}
    }
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        while (root!=null){
            TreeLinkNode pre = null;
            TreeLinkNode cur = root;
            while (cur!=null){
                if(pre!=null){
                    pre.next=cur.right;
                }
                if(cur.left!=null)cur.left.next=cur.right;
                pre=cur.right;
                cur=cur.next;
            }
            root=root.left;
        }
    }
}
