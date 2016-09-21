package bianchengzhifa;

/**
 * Created by lon on 16-9-2.
 */
import java.util.ArrayList;
import java.util.List;
public class Solution3 {
    public static void main(String[] args) {
        List<String> ret = calcAllPermutation("abcd");
        System.out.println(ret);
        allZuhe("abc");
    }

    static List<String> calcAllPermutation(String str){
        List<String> ret = new ArrayList<>();
        helper(ret, str.toCharArray(), 0, str.length());
        return ret;
    }
    static void helper(List<String>list,char[] array ,int beg,int end){
        if(beg==end){
            list.add(new String(array));
            return;
        }
        for (int i = beg; i <end ; i++) {
            swap(array,beg,i);

            helper(list, array, beg + 1, end);

            swap(array, beg, i);
        }
    }
    static void swap(char[] array , int beg , int end){
        char t = array[beg];

        array[beg]=array[end];

        array[end]=t;
    }

    static void allZuhe(String str){
        if(str == null ) return;
        List<String> list = new ArrayList<>();
        int len = str.length();
        int num = (1<<len);
        for (int i = 1; i <num ; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j <len ; j++) {
                if((i&(1<<j))!=0)
                    sb.append(str.charAt(j));
            }
            list.add(sb.toString());
        }
        System.out.println(list);
    }

}
