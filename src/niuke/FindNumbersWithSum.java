package niuke;

import java.util.ArrayList;

/**
 * Created by lon on 16-6-1.
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer>  list= new ArrayList<Integer>();
        if(array==null || array.length<2)return list;
        int i = 0;
        int j = array.length-1;
        while(i<j){
            int s = array[i]+array[j];
            if(sum==s){
                list.add(array[i]);
                list.add(array[j]);
                break;
            }else if(sum>s)
                i++;
            else j--;
        }
        return list;
    }

    public static void main(String[] args) {
        int [] array ={1,2,4,7,11,15};
        new FindNumbersWithSum().FindNumbersWithSum(array,15);

    }
}
