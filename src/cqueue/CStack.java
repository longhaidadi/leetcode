package cqueue;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by lon on 16-5-9.
 */
public class CStack<T> {

    private LinkedList<T> s1;
    private LinkedList<T> s2;
    public CStack(){
        s1 = new LinkedList<T>();
        s2 = new LinkedList<T>();
    }
    public void push(T data){
        if(s1.isEmpty() && s2.isEmpty()){
            s1.push(data);
        }else if(!s1.isEmpty()){
            s1.push(data);
        }else if (!s2.isEmpty()){
            s2.push(data);
        }
    }
    public T pop(){
        T data = null;
        if(s1.isEmpty()&& s2.isEmpty()){
            return null;
        }
        if(s2.isEmpty()){
            while (s1.size()>0){
                data = s1.pop();
                if(!s1.isEmpty()){
                    s2.add(data);
                }
            }
        }else if (s1.isEmpty()){
            while (s2.size()>0){
                data = s2.pop();
                if(!s2.isEmpty()){
                    s1.add(data);
                }
            }
        }
        return data;
    }

}
