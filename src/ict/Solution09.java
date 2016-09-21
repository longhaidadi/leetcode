package ict;

/**
 * Created by lon on 16-3-21.
 */
public class Solution09 {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else if(x==0)
            return true;
        int base = 1;
        while (x/base >=10){
            base *= 10;
        }
        while(x!=0){
            int left = x/base;
            int right = x%10;
            if(left!=right)return false;
            x -= base*left;
            base = base/100;
            x = x/10;
        }
        return true;
    }

}
