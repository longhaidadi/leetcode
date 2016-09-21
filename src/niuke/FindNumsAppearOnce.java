package niuke;

import java.util.ArrayList;

/**
 * Created by lon on 16-6-1.
 */
import java.util.List;
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null || array.length==0)return;
        int orvalue = 0;
        for(int a : array) orvalue ^= a;
        int pos = get1Pos(orvalue);
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        split(array,pos,list1,list2);
        num1[0]=getOrValue(list1);
        num2[0]=getOrValue(list2);
    }
    private int getOrValue(List<Integer> list){
        int ret = 0;
        for(int a : list){
            ret ^= a;
        }
        return ret;
    }
    private void split(int[]array,int pos ,List<Integer>list1,List<Integer>list2){
        int n = 1<<pos;
        for(int a : array){
            if((n&a)!=0)
                list1.add(a);
            else list2.add(a);
        }

    }
    private int get1Pos(int n){
        int pos = 0;
        while(pos<=32){
            if((n&(1<<pos))!=0)
                return pos;
            pos++;
        }
        return pos;

    }

    public static void main(String[] args) {
        int [] array = {2,4,3,6,3,2,5,5};
        int [] array1 = new int[1];
        int [] array2 = new int[2];
        new FindNumsAppearOnce().FindNumsAppearOnce(array, array1, array2);
    }
}
