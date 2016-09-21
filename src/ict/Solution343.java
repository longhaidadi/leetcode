package ict;

/**
 * Created by lon on 16-4-19.
 */
public class Solution343 {
    public int integerBreak(int n) {
        if(n<=0)return 0;
        if(n==1) return 1;
        int [] ret = new int[n+1];
        ret[1]=1;
        for(int i =2;i<=n;i++){
            int t = (int) Math.sqrt(i);
            int a = Math.max(ret[t],t);
            int b = Math.max(ret[i-t],i-t);
            ret[i]= a*b;
        }
        return ret[n];
    }
}
