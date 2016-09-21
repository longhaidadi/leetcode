package ict;


import java.util.Stack;

/**
 * Created by lon on 16-3-25.
 */
public class Solution224 {
    public static void main(String[] args) {

    }
    public int calculate(String s) {
        int ret = 0;
        Stack<Integer> data = new Stack<>();
        Stack<Character> oper = new Stack<>();
        int i = 0;
        while (i<s.length()){
            char c = s.charAt(i);
            if(c=='(') {
                oper.push(c);
                i++;
            }
            else if (c==')'){
                int t1 = data.pop();
                int t2 = data.pop();
                data.push(t1+t2);
                i++;
            }else {
                int [] tmp = getNextData(s,i+1,s.length());
                i = tmp[1];
                data.push(tmp[0]);
            }
        }
        if(data.isEmpty())return 0;
        return data.peek();
    }
    private int[] getNextData(String s , int beginPos,int len){
        int [] ret = new  int[2];
        int curPos = beginPos;
        boolean isPositive = true;
        boolean canStop = false;

        int num = 0;
        while (curPos<len){
            if(s.charAt(curPos)=='-'  &&!canStop ){
                isPositive=false;
                canStop = true;
            }else if(s.charAt(curPos)=='+' &&!canStop ){
                isPositive=true;
                canStop = true;
            }else if(s.charAt(curPos)==' ' ){

            }else if(s.charAt(curPos)>='0' && s.charAt(curPos)<='9'){
                num = num*10+(s.charAt(curPos)-'0');
            }else{
                break;
            }
            curPos++;
        }
        ret[0]=isPositive?num:(-num);
        ret[1]=curPos;
        return ret;
    }

}
