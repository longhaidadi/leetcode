package ict;

/**
 * Created by lon on 16-5-3.
 */
public class Solution70 {
    public static void main(String[] args) {

    }
    public int climbStairs(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        int n1 = 1;
        int n2 = 2;
        int sum = 0;
        for(int i =3;i<=n;i++){
            sum = n1+n2;
            n1=n2;
            n2=sum;
        }
        return sum;
    }
}
