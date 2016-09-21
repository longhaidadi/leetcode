package ict;

/**
 * Created by lon on 16-5-9.
 */
public class Solution109 {
    public static void main(String[] args) {

    }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode tmp = head;
        int len = 0;
        while (tmp!=null){
            len++;
            tmp=tmp.next;
        }
        return buildTree(head,len);
    }
    private TreeNode buildTree(ListNode head,int len){
        if(len<=0)return null;
        if(len==1)return new TreeNode(head.val);
        ListNode root = head;
        int mid = (len-1)/2;
        for(int i =0;i<mid;i++)root=root.next;
        TreeNode node = new TreeNode(root.val);
        node.left=buildTree(head,mid-1);
        node.right=buildTree(root.next,len-(mid));
        return node;
    }
}
