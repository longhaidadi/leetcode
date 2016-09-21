package ict;

/**
 * Created by lon on 16-5-3.
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        if(a==null || a.isEmpty())return b;
        if(b==null || b.isEmpty())return a;
        char [] aArray = a.toCharArray();
        char [] bArray = b.toCharArray();
        int aLen = aArray.length;
        int bLen = bArray.length;
        int carray = 0;
        int i = Math.max(aLen,bLen);
        char [] ret = new char[i];
        while (i>0){
            int an = 0;
            if(aLen>0)an = aArray[aLen-1]-'0';
            int bn = 0;
            if(bLen>0)bn=bArray[bLen-1]-'0';
            aLen--;
            bLen--;

            ret[i-1]= (char) ((carray + an + bn) % 2+'0');
            carray = (carray + an+bn)/2;
            i--;
        }
        String s = String.valueOf(ret);
        if(carray==1) {
           return 1+s;
        }else return s;
    }

    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        String ret = solution67.addBinary("11","1");
        System.out.println(ret);
    }
}
