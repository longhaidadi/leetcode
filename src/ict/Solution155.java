package ict;

import java.util.Stack;

/**
 * Created by lon on 16-5-16.
 */
public class Solution155 {
    /** initialize your data structure here. */
    public Solution155() {

    }

    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x) {
        if(s.isEmpty())minStack.push(x);
        else {
            if(minStack.peek()>=x){
                minStack.push(x);
            }
        }
        s.push(x);
    }

    public void pop() {
        if(s.isEmpty())return;
        int tmp = s.pop();
        if(tmp==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
