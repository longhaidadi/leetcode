package niuke;

/**
 * Created by lon on 16-6-2.
 */
public class multiply {
    public int[] multiply(int[] A) {
        if(A==null || A.length==0)return null;
        int len = A.length;
        int[] B1 = new int[len];
        int[] B2 = new int[len];
        int[] R = new int[len];
        B1[0]=1;
        B2[len-1]=1;
        for(int i = 1;i<len;i++)B1[i]=B1[i-1]*A[i-1];
        for(int i = len-2;i>=0;i--) B2[i]=B2[i+1]*A[i+1];
        for(int i =0;i<len;i++)
            R[i]=B1[i]*B2[i];
        return R;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        new multiply().multiply(array);
    }
}
