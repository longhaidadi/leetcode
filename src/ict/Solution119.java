package ict;

/**
 * Created by lon on 16-7-30.
 */
import java.util.Arrays;
import java.util.List;
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0)return null;
        Integer [] array = new Integer[rowIndex+1];
        array[0]=1;
        for(int i =1 ;i<=rowIndex;i++){
            array[i]=(int)((long)(array[i-1]*(rowIndex-i+1)))/i;
        }
        return Arrays.asList(array);
    }
}
