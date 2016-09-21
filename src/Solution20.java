import java.util.Stack;

/**
 * Created by lon on 16-3-21.
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c == '{' || c=='['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.pop()!='(')
                    return  false;
            }if(c == ']') {
                if(stack.isEmpty() || stack.pop()!='[')
                    return false;
            }if(c == '}') {
                if(stack.isEmpty() || stack.pop()!='{')
                    return false;
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {

    }
}
