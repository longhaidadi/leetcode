package ict;

/**
 * Created by lon on 16-6-21.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144_preOrder {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList();
        Stack<TreeNode>stack = new Stack<>();
        while (root!=null ){
            list.add(root.val);
            if(root.right!=null)
                stack.push(root.right);
            root=root.left;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop().val);
        }
        return list;
    }
}
