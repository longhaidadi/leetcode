package ict;

/**
 * Created by lon on 16-3-30.
 */
public class Solution106 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        int [] array1={1,2,3};
        int [] array2={3,2,1};
        Solution106 solution106 = new Solution106();
        solution106.buildTree(array1,array2);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return getNode(inorder, postorder, 0, inorder.length - 1, 0, postorder.length-1);
    }

    public TreeNode getNode(int [] inorder,int [] postorder,int inStart,int inEnd,int postStart,int postEnd){
        if(inStart<=inEnd ){
            int rootVal = postorder[postEnd];
            int index =inStart;
            while(index<=inEnd&&inorder[index]!=rootVal) index++;

            TreeNode root = new TreeNode(rootVal);
            root.left=getNode(inorder,postorder,inStart,index-1,postStart,postStart+(index-inStart-1));
            root.right=getNode(inorder,postorder,index+1,inEnd,postStart+index-inStart,postEnd-1);
            return root;
        }
        return null;
    }
}
