package bianchengzhifa;

/**
 * Created by lon on 16-9-2.
 */
public class Solution4 {
    public static void main(String[] args) {
        manacher("aaaa");
    }
     static void manacher(String str){
        if(str==null || str.length()==0) return;
        int id = 0;
        int max = 0;
         str = getNewString(str);
         int [] p = new int[str.length()];
         int maxLen = 0;
         for (int i = 1; i <str.length() ; i++) {
             if(max>i){
                p[i]= Math.min(p[id*2-i],max-i);
             }else{
                 p[i]=1;
             }
             while (i-p[i]>=0 && i+p[i]<str.length()&&str.charAt(i+p[i])==str.charAt(i-p[i]))p[i]++;
             if(p[i]+i>max){
                 id = i;
                 max = p[i]+i;
             }
             maxLen = Math.max(maxLen,p[i]);
         }
         System.out.println(maxLen/2);

    }
    static String getNewString(String str){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length() ; i++) {
            sb.append('*').append(str.charAt(i));
        }
        sb.append('*');
        return sb.toString();
    }

}
