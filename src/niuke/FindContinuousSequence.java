package niuke;

import java.util.ArrayList;

/**
 * Created by lon on 16-6-1.
 */
public class FindContinuousSequence {
    public static void main(String[] args) {
        new FindContinuousSequence().FindContinuousSequence(4);
    }
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
        if(sum<=0)return list;
        int slow = 1;
        int fast = 1;
        int t = 0;
        ArrayList<Integer> tlist = new ArrayList<Integer>();
        while(slow<=fast && fast <=sum){
            while(t<=sum){
                t += fast;
                tlist.add(fast);
                fast++;
            }
            if(t==sum){
                list.add(new ArrayList(tlist));

            }else {
                t -= slow;
                tlist.remove(0);

                slow++;
            }

        }
        return list;
    }
}
