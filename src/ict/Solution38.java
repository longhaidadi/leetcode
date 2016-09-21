package ict;

/**
 * Created by lon on 16-4-5.
 */
public class Solution38 {
    public String countAndSay(int n) {

        if(n==0)return "";
        if(n==1)return "1";
        String init = "1";
        for (int i = 2;i<=n;i++){
           init = say(init);
        }
        return init;
    }

    public String countAndSay1(int n){
        if(n==0) return "";
        if(n==1) return "1";
        String ret = "1";
        for (int i = 1; i <n ; i++) {
            ret = say1(ret);
        }
        return ret;
    }
    public String say1(String ret){
        StringBuffer sb = new StringBuffer();
        int count = 1;
        char last = ret.charAt(0);
        for (int i = 1; i <ret.length() ; i++) {
            char c = ret.charAt(i);
            if(last==c){
                count++;
            }else {
                sb.append(count).append(last);
                last = c;
                count=1;
            }
        }
        sb.append(count).append(last);
        return sb.toString();
    }
    public String say(String init){
        StringBuffer sb = new StringBuffer();
        int count = 1;
        char last = init.charAt(0);
        for(int i =1;i<init.length();i++){
            if(init.charAt(i)==last){
                count++;
            }else{
                sb.append(count).append(last);
                last=init.charAt(i);
                count=1;
            }
        }
        sb.append(count).append(last);
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        solution38.countAndSay(1);
    }
}
