package ict;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lon on 16-3-21.
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        gen("", ret, n, n);
        return ret;
    }
    public void  gen(String temp ,List<String> ret , int left ,int right){
        if(left==0 && left == right) {
            ret.add(temp);
            return;
        }
        if(left>=0)
            gen(temp + "(", ret, left - 1, right);
        if(left<right)
            gen(temp+")",ret,left,right-1);
    }
    public List<String> generateParenthesis1(int n) {
        List<String> list = new ArrayList<>();
        gen1("" ,list, n,n);
        return list;
    }
    static void gen1(String tmp , List<String> list,int left , int right){
        if(left == 0 && right==0){
             list.add(tmp);
            return;
        }
        if(left>0){
            gen1( tmp+"(", list, left - 1, right);
        }
        if(left<right){
            gen1(tmp+")",list,left,right-1);
        }
    }



    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        List<String> ret =solution22.generateParenthesis1(3);
        System.out.println(ret);
    }


}
