package ict;

/**
 * Created by lon on 16-5-5.
 */
public class Solution105 {
    public static void main(String[] args) {
        int [] preorder = {2,1,6,4,3,5};
        int [] inorder = {1,2,3,4,5,6};
        new Solution105().buildTree(preorder,inorder);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode build(int [] preorder ,int [] inorder ,int preStart,int preEnd,int inorderStart,int inorderEnd){
        if(preStart>preorder.length-1)return null;
        if(inorderStart<=inorderEnd ){
            int rootVal = preorder[preStart];
            int index = inorderStart;
            while (index<=inorderEnd && inorder[index]!=rootVal)index++;
            int leftLen = index-inorderStart;
            TreeNode root = new TreeNode(rootVal);
            System.out.println("leftLen " + leftLen);
            if(leftLen>0)
                root.left=build(preorder,inorder,preStart+1,preStart+leftLen,inorderStart,inorderStart+leftLen-1);
            if(leftLen<preEnd-preStart)
                root.right=build(preorder,inorder,preStart+leftLen+1,preEnd,inorderStart+leftLen+1,inorderEnd);
            return root;
        }
        return null;
    }

}
