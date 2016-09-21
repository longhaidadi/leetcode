package ict;


import java.util.Map;


/**
 * Created by lon on 16-3-31.
 */
public class Solution114 {

    //后序遍历从树的最下层开始遍历,比如在求树的高度,树与链表常采用的方式.这个需要子树的子问题解决才能解决父亲节点的方法.
    //前序遍历是从上到下进行遍历的,如果不需要子问题的解决就可以解决,比如从上到下遍历路径

    //此题是需要子文题的解决才能解决的//并且是需要先把右子树整好了,才能挂在左子树下
    public void flatten1(TreeNode root){
        if(root==null)return;
        flatten1(root.right);
        flatten1(root.left);



        //先递归遍历右子树,意识是右子树先成为子树的解决规模,在解决左子树也成为要成为的子文题规模
        // 遍历先到整个树的最右端的叶子节点,那么这个叶子节点是否右左子树呢?不清楚,如果有再进入左子树的最右端,这样已知下去到最最右段.
        //意思这个节点是个叶子节点.并不左什么.
        //现在开始考虑子文题.意思是右子树都被接下来的处理了,左子树也被街下俩的处理了,但是左右子树的当前节点还未处理.
        //所以
        TreeNode rightLeaf = rightLeaf(root.left);
        if(rightLeaf!=null){
            rightLeaf.right=root.right;
            root.right=root.left;
            root.left=null;
        }

        //关于这个一点思考,我们看到这些递归时候,首先应想到最下层,即一个节点在在右下角,右左子树也有右子树,并且其中有个子树为空
        //或者某个叶子节点只有一个

    }
    private TreeNode rightLeaf(TreeNode node){
        if(node==null || node.right==null)
            return node;
        return rightLeaf(node.right);
    }
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur!=null){
            if(cur.left==null)cur=cur.right;
            else {
                pre = cur.left;
                while (pre.right!=null)pre=pre.right;
                pre.right=cur.right;
                cur.right=cur.left;
                cur.left=null;
            }
        }
    }



    public static void main(String[] args) {
        String str = "";
        test(str);
        System.out.println(str);
    }
    public static void test(String str){
        str="Hello";
    }

}
