package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-6-22.
 */
public class Solution06 {
    public static void main(String[] args) {
        String ret = new Solution06().convert("PAYPALISHIRING",3);
        System.out.println(ret);
    }
    public String convert(String s, int numRows) {
        if(s==null || s.length()<numRows)return s;
        int row = 0;
        String[] array = new String[numRows];
        Arrays.fill(array,"");
        boolean isPositive = true;
        for (int i = 0; i <s.length() ; i++) {
            if(isPositive){
                array[row] += s.charAt(i);
                row++;
                if(row==numRows){
                    row -= 2;
                    isPositive=false;
                }
            }else {
                array[row] += s.charAt(i);
                row--;
                if(row==-1){
                    row=1;
                    isPositive=true;
                }
            }
        }
        String ret = "";
        for (String st : array){
            ret += st;
        }
        return ret;
    }

    static String convert1(String s, int numRows){
        if(s==null || s.length()==0 || numRows==0)return "";
        int row = 0;
        StringBuffer [] sbs = new StringBuffer[numRows];
        boolean isPositive = true;
        for (int i = 0; i <s.length() ; i++) {
            if(isPositive){
                sbs[row].append(s.charAt(i));
                row++;
                if(row==numRows){
                    row = numRows-2;
                    isPositive=false;
                }
            }else {
                sbs[row].append(s.charAt(i));
                row--;
                if(row==-1){
                    row = 1;
                    isPositive=true;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for(StringBuffer sbsb : sbs){
            sb.append(sbsb);
        }
        return sb.toString();
    }
}
