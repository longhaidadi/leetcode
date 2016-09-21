package tree;

import ict.TreeNode;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Stack;

/**
 * Created by lon on 16-8-25.
 */
public class Order {
    static void preOrde(TreeNode root){
        if(root==null)return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p!=null && !stack.isEmpty()){
            while (p!=null){
                visit(p);
                stack.push(p);
                p = p.left;
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                p = p.right;
            }
        }
    }
    static void inorder(TreeNode root){
        if(root == null )return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p!=null || stack.isEmpty()){
            while (p!=null){
                stack.push(p);
                p = p.left;
            }
            if(stack.isEmpty()){
              p = stack.pop();
                visit(p);
                p = p.right;
            }

        }
    }

    static void visit(TreeNode p){

    }

    static void postOrder(TreeNode root){
        if(root==null) return;
        Stack<BTNode> stack = new Stack<>();
        TreeNode p =root;
        BTNode tmp = null;
        while (p!=null || !stack.isEmpty()){
            while (p!=null){
                BTNode btnode = new BTNode(p);
                stack.push(btnode);
                p = p.left;
            }
            if(!stack.isEmpty()){
                tmp = stack.pop();
                if(tmp.isFirst==true){
                    tmp.changeStatus();
                    stack.push(tmp);
                    p = p.right;
                }else{
                    visit(tmp.node);
                    p = null;
                }
            }
        }
    }

    static void postOrder3(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = null;
        TreeNode pre = null;
        while (!stack.isEmpty()){
            cur = stack.peek();
            if((cur.left==null && cur.right==null) || (cur!=null && (pre==cur.left || pre == cur.right))){
                visit(cur);
                pre = cur;
            }else {
                if(cur.left!=null)postOrder3(cur.left);
                if(cur.right!=null) postOrder3(cur.right);
            }
        }
    }
    static class BTNode{
        TreeNode node ;
        boolean isFirst;
        public BTNode(TreeNode node ){
            this.node = node;
            this.isFirst = true;
        }
        public void changeStatus(){
            isFirst = false;
        }

        public boolean isFirst() {
            return isFirst;
        }
    }
}
