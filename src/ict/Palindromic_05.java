package ict;

/**
 * Created by lon on 16-3-21.
 */
public class Palindromic_05 {
    public String longestPalindrome(String s) {
        String str = preStr(s);
        System.out.println(str);
        int length = str.length();
        int [] p = new int[length];
        int C = 0;
        int R = 0;
        for(int i =1;i<length-1;i++){
            int i_mirror = C-(i-C);
            int diff = R-i;
            if(diff>=0){
                if(p[i_mirror]<diff)
                    p[i]=p[i_mirror];
                else {
                    p[i]=diff;
                    while (i+p[i]+1<str.length()&&(i-p[i]-1)>=0&&str.charAt(i+p[i]+1)==str.charAt(i-p[i]-1)) p[i]++;
                    C=i;
                    R=i+p[i];

                }
            }else {
                p[i]=0;
                while (i+p[i]+1<str.length()&&(i-p[i]-1)>=0 && str.charAt(i+p[i]+1) == str.charAt(i-p[i]-1)  )p[i]++;
                C=i;
                R=i+p[i];
            }
        }

        int maxPos = 0;
        for(int i =0;i<str.length();i++){
            if(p[i]>p[maxPos]){
                maxPos=i;
            }
        }
        System.out.println(s);
        System.out.println(maxPos);
        System.out.println(p[maxPos]);
       return s.substring((maxPos-p[maxPos])/2,(maxPos+p[maxPos])/2);

    }
    public String preStr(String s){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i =0;i<s.length();i++){
            stringBuffer.append("#").append(s.charAt(i));
        }
        stringBuffer.append("#");
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        Palindromic_05 test = new Palindromic_05();
        System.out.println(test.longestPalindrome("abb"));
    }
}
