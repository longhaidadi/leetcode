package ict.package328;

/**
 * Created by lon on 16-3-1.
 */
public class Solution326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
    public static boolean isPowerOfThree(int n){

        while (n!=1){
            System.out.println(n);
            if(n%3!=0)
                return false;
            n = n/3;
        }
        return true;
    }


}
