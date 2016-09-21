package ict;

/**
 * Created by lon on 16-3-22.
 */
public class Solution335 {
    public boolean isSelfCrossing(int[] x) {
        if(x==null || x.length<=3) return false;

        int len = x.length;
        for(int i =3;i<len;i++){
            if(x[i]>=x[i-2] && x[i-1]<= x[i-3])
                return true;
        }

        for(int i =4 ; i<len;i++){
            if((x[i]>=Math.max(x[i-4],x[i-2]) && x[i-1]<=x[i-3])||
                    (x[i]+x[i-4]>=x[i-2] && x[i-1]==x[i-3]))
                return true;
        }

        for(int i =5;i<len;i++){
            if(x[i] + x[i-2]>=x[i-4] && x[i-1] + x[i-5]>=x[i-3])
                return true;
        }
        return false;


    }

    public static void main(String[] args) {

    }
}
