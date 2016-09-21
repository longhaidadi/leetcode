package ict;

/**
 * Created by lon on 16-5-4.
 */
import java.util.ArrayList;
import java.util.List;
public class Solution93 {
    public static void main(String[] args) {
        Solution93 solution93 = new Solution93();
        System.out.println(solution93.restoreIpAddresses("172162541"));
    }
    public List<String> restoreIpAddresses(String s) {
        List<String>ret = new ArrayList<>();
        if(s.length()>12|| s.length()<4)return ret;
        backtracking(ret,s,0,0,new StringBuffer());
        return ret;
    }
    private void backtracking(List<String>ret ,String s , int index ,int n ,StringBuffer sb){
        if(index + 3*(4-n)<s.length() || index+(4-n)>s.length())return;
        if(n==4){
            String tmp = sb.substring(0,sb.length()-1);
            ret.add(tmp);
            return;
        }
        if(s.charAt(index)=='0'){
            StringBuffer sb1 = new StringBuffer(sb);
            sb1.append("0.");
            backtracking(ret,s,index+1,n+1,sb1);
        }else {
            for(int i = index;i<index+3 && i < s.length();i++){
                String t = s.substring(index,i+1);
                if(Integer.parseInt(t)>255)break;
                StringBuffer sb1 = new StringBuffer(sb);
                sb1.append(s.substring(index, i + 1) + ".");
                backtracking(ret,s,i+1,n+1,sb1);
            }
        }
    }
}
