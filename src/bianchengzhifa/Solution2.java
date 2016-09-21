package bianchengzhifa;

/**
 * Created by lon on 16-9-2.
 */
public class Solution2 {
    public static void main(String[] args) {

    }
    static boolean  contain_1(String source,String str){
        if(source==null || str == null) return false;
        int hash = 0;
        for (int i = 0; i <source.length() ; i++) {
            hash = hash|(1<<(source.charAt(i)-'A'));
        }
        for (int i = 0; i < str.length(); i++) {
            if((hash & (1<<(str.charAt(i)-'A'))) ==0)
                return false;
        }
        return true;
    }
    static boolean contain_2(String source,String str){
        if(source==null || str == null) return false;
        int [] array = new int[256];
        for (int i = 0; i <source.length() ; i++) {
            array[source.charAt(i)]++;
        }
        for (int i = 0; i <str.length(); i++) {
            array[str.charAt(i)]--;
        }
        for (int i : array) {
            if(i!=0)return false;
        }
        return true;
    }
}
