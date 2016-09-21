package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-4-25.
 */
public class Solution43 {
    public static void main(String[] args) {
        String str1 = "98";
        String str2 = "9";
        String product = new Solution43().multiply1(str1, str2);
        System.out.println(product);
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        char[] prod = new char[num1.length() + num2.length()];
        int pos = 0;
        int carray = 0;
        Arrays.fill(prod, (char) 0);
        for (int i = num1.length() - 1; i >= 0; i--) {
            if (num1.charAt(i) != '0') {
                for (int j = num2.length() - 1; j >= 0; j--) {
                    pos = i + j - 1;
                    int val = (int) prod[pos];
                    val += carray + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    prod[pos] = (char) (val % 10);
                    carray = val / 10;
                }
            }
            if (carray != 0) {
                prod[pos - 1] = (char) carray;
                carray = 0;
            }
        }
        String product = "";
        for(char c : prod){
            product += (char)((int)c+(int)'0');
        }
        if (prod[0] == 0 ) return product.substring(1, product.length());
        return product;
    }

    public String multiply1(String num1, String num2){
        if(num1.equals("0")  || num2.equals("0") ) return "0";
        char [] product = new char[num1.length() + num2.length()];
        Arrays.fill(product,'0');
        int carray  = 0;
        int pos =0;
        for (int i = num1.length()-1; i>=0 ; i--) {
            char c1 = num1.charAt(i);
            if(c1!='0'){
                for (int j = num2.length()-1; j >=0 ; j--) {
                    char c2 = num2.charAt(j);
                    int p = (c1-'0')*(c2-'0')+carray;
                    pos = i+j+1;
                    carray = p/10;
                    if(product[pos]+p%10>'9'){
                        product[pos] = (char) (product[pos]+(p%10-10));
                        carray++;
                    }else {
                        product[pos] = (char) (product[pos] + p % 10);
                    }

                }
            }
            if(carray!=0){
                product[i] += carray;
                carray=0;
            }
            System.out.println(new String(product));
        }
        String p = new String(product);
        int index ;
        for ( index= 0; index <p.length() ; index++) {
            if(p.charAt(index)!='0')break;
        }
        return p.substring(index);
    }
}
