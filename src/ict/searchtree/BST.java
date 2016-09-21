package ict.searchtree;

import ict.TreeNode;

/**
 * Created by lon on 16-5-5.
 */
public class BST {
    TreeNode root;
    public TreeNode search(int val){
        TreeNode node = root;
        while (node!=null ){
            if(node.val==val)return node;
            else if(node.val>val)node=node.left;
            else node=node.right;
        }
        return node;
    }
    public void insert(int key){
        TreeNode node = new TreeNode(key);
        if(root == null){
            root = node;
            return;
        }
        TreeNode currentNode = root;
        TreeNode parentNode;
        while (true){
            parentNode = currentNode;
            if(currentNode.val>key){
                currentNode = currentNode.left;
                if(currentNode==null){
                    parentNode.left=node;
                    return;
                }
            }else if(currentNode.val<key){
                currentNode = currentNode.right;
                if(currentNode==null){
                    parentNode.right=node;
                    return;
                }
            }else return;
        }

    }
}
