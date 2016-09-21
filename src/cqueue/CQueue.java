package cqueue;

import java.util.Stack;

/**
 * Created by lon on 16-5-9.
 */
public class CQueue<T>{
    private Stack<T>stack1;
    private Stack<T>stack2;

    public CQueue() {
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
    }

    public void push(T data){
        stack1.push(data);
    }

    public T pop(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                T data = stack1.pop();
                stack2.push(data);
            }
        }
        if(!stack2.isEmpty())
            return stack2.pop();
        return null;
    }

    public static void main(String[] args) {
        CQueue<Integer> queue = new CQueue<>();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }

}
