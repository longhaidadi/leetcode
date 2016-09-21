package ict;

import java.util.Stack;

/**
 * Created by lon on 16-4-5.
 */
public class Solution71 {
    public String simplifyPath(String path) {

        String [] array = path.split("/");
        Stack<String> stack = new Stack();
        for(String s : array){
            if(s.equals("")) continue;
            else if(s.equals(".")) continue;
            else if(s.equals(".."))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else stack.push(s);
        }
        String strRet = "";
        while (!stack.isEmpty()){
            String s = stack.pop();
            strRet = "/"+s+strRet;
        }
        return strRet;

    }

    public static void main(String[] args) {
        Solution71 solution71 = new Solution71();
        solution71.simplifyPath("/abc/...");
    }
}
