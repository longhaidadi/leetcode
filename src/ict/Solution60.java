package ict;

/**
 * Created by lon on 16-5-3.
 */
import java.util.ArrayList;
import java.util.List;
public class Solution60 {
    public static void main(String[] args) {
        Solution60 solution60 = new Solution60();
        String ret = solution60.getPermutation(5,2);
        System.out.println(ret);
    }
    public String getPermutation(int n, int k) {
        StringBuffer stringBuffer = new StringBuffer();
        int f = 1;
        List <Integer> index = new ArrayList<>();
        for(int i =0;i<n;i++){
            index.add(i+1);
            f *= (i+1);
        }
        f = f/n;
        int j = n-1;
        k--;
        while (k>0) {
            int s = k / f;
            stringBuffer.append(index.get(s));
            index.remove(s);
            k = k% f;
            f = f / j;
            j--;
        }
        for(int s : index)
            stringBuffer.append(s);
        return stringBuffer.toString();
    }
}
