package ict;

/**
 * Created by lon on 16-9-5.
 */
import ict.Solution56.Interval;

import java.util.ArrayList;
import java.util.List;
public class Solution57 {
    public static void main(String[] args) {

    }
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> list = new ArrayList<>();
        if(intervals==null  || intervals.isEmpty()){
            list.add(newInterval);
            return list;
        }
        boolean isSucess = false;
        for (int i = 0; i < intervals.size(); i++) {
            if(!isSucess){
                Interval cur = intervals.get(i);
                if(cur.end < newInterval.start){
                    list.add(cur);
                }else if (cur.start > newInterval.end){
                    list.add(newInterval);
                    list.add(cur);
                    isSucess = true;
                }else{
                    newInterval.start = Math.min(cur.start,newInterval.start);
                    newInterval.end = Math.max(cur.end,newInterval.end);
                }
            }else
                list.add(intervals.get(i));
        }
        if(!isSucess) list.add(newInterval);
        return list;
    }
}
