package ict.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lon on 16-3-5.
 */
public class TestArray {

    public static List<String> wholeArray(String [] array){
        List<String> ret = new ArrayList<>();
        int sum = (int)Math.pow(2,array.length);
        for(int i =0;i<sum;i++){
            String str = "";
            for(int j =0;j<array.length;j++){
                if((i & (1 << j) )!=0){
                    str += array[j];
                }

            }
            System.out.println(str);
            ret.add(str);
            System.out.println(i);
        }
        return ret;
    }
    public static void main(String[] args) {
     char[]array={'a','b','c','d'};
       wholeArray2(array, 0, array.length - 1);
    }


    public static void wholeArray1(String [] array,String tmp,List<String>ret,int index){
        if(array.length==index){
            ret.add(tmp);
            return;
        }
        wholeArray1(array,tmp,ret,index+1);
        tmp=tmp+array[index];
        wholeArray1(array, tmp, ret, index + 1);
    }

    public static void wholeArray2(char [] array,int from , int to){
        if(to<=1){
            return;
        }
        if(from==to){
           for(int i =0;i<=to;i++) System.out.print(array[i]);
            System.out.println();
        }else{
            for(int j =from;j<=to;j++){
                char a = array[j];
                array[j]=array[from];
                array[from]=a;

                wholeArray2(array, from + 1, to);

                a = array[j];
                array[j]=array[from];
                array[from]=a;
            }

        }
    }
}
