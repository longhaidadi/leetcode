package ict;

/**
 * Created by lon on 16-5-12.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Solution131 {
    public static void main(String[] args) {
        Solution131 solution131 = new Solution131();
        solution131.partition("aab");
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ret = new ArrayList<>();
        if(s==null || s.length()==0)return ret;
        helper(s,0,new LinkedList<String>(),ret);
        System.out.println(ret);
        return ret;
    }
   private void helper(String s, int start , LinkedList<String> tmp , List<List<String>> result){
       if(start>=s.length()){
           result.add(new LinkedList<String>(tmp));
           return;
       }
       for (int i = start; i <s.length() ; i++) {
            if(isPalindrome(s,start,i)){
                tmp.add(s.substring(start,i+1));
                helper(s,i+1,tmp,result);
                tmp.removeLast();
            }
       }

   }
    private boolean isPalindrome(String s,int start,int end){
        while (start<end){
            if(s.charAt(start++)!=s.charAt(end--))return false;
        }
        return true;
    }

}
