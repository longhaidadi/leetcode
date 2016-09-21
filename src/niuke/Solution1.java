package niuke;

/**
 * Created by lon on 16-5-17.
 */
public class Solution1 {
    public String replaceSpace(StringBuffer str) {
        if(str==null|| str.length()==0)return "";
        int len = str.length();
        int spaceCount = 0;
        for(int i =0;i<len;i++){
            if(str.charAt(i)==' ')spaceCount++;
        }
        int newLen = len+spaceCount*2;


        str.setLength(newLen);
        int fast = len-1;
        int slow = newLen-1;
        while (fast>=0 && slow>=0){
            char c = str.charAt(fast);
            if(c==' '){
                str.setCharAt(slow--,'0');
                str.setCharAt(slow--,'2');
                str.setCharAt(slow--, '%');

            }else{
                str.setCharAt(slow--,c);
            }
            fast--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("  ");

        String ret = new Solution1().replaceSpace(str);
        System.out.println(ret);
    }
}
