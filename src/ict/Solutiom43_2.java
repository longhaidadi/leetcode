package ict;

import java.util.Arrays;

/**
 * Created by lon on 16-6-14.
 */
public class Solutiom43_2 {
    public String multiply(String num1,String num2){
        if(num1==null || num2 == null) return "";
        int len1 = num1.length();
        int len2 = num2.length();
        if(len1==0 || len2==0) return "0";
        char [] array = new char[len1+len2];
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        Arrays.fill(array, '0');
        int carry = 0;
        for(int i = num1Array.length-1; i >=0 ;  i--){
            for (int j = num2Array.length-1;j>=0;j--){
                int i1 = num1Array[i]-'0';
                int i2 = num2Array[j]-'0';
                int val = (array[i+j+1]-'0')+carry+i1*i2;
                carry = val/10;
                int t =val%10;
                array[i+j+1] =(char)( t + '0');
            }
            if(carry!=0) {
                array[i] += carry;
                carry=0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(array);
        if(carry==0)
            return new String(array).substring(1);
        else {
            array[0] += carry;
            return new String(array);
        }

    }

    public static void main(String[] args) {
        String ret = new Solutiom43_2().multiply("123","456");
        System.out.println(ret);
    }
}
