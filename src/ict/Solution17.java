package ict;

/**
 * Created by lon on 16-8-28.
 */
import java.util.ArrayList;
import java.util.List;
public class Solution17 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = letterCombinations("23");
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        char [] array = new char[digits.length()];
        run(digits,0,list,array);
        return list;
    }

    static void run(String string, int idx,List<String>list,char [] array){
        if(string.length() == idx){
            String tmp = new String(array);
            list.add(tmp);
            return;
        }
        String str = getLetter(string.charAt(idx));
        for (int i = 0; i <str.length() ; i++) {
            array[idx] = str.charAt(i);
            run(string,idx+1,list,array);
        }
    }
    static String getLetter(char c){
        switch (c){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
        }
        return "";
    }
}
