package ict;

/**
 * Created by lon on 16-8-29.
 */
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Solution56 {
     public static class Interval {
             int start;
             int end;
             Interval() { start = 0; end = 0; }
             Interval(int s, int e) { start = s; end = e; }
         }
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList<>();
        if(intervals==null || intervals.isEmpty())return list;
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start==o2.start)
                    return Integer.compare(o1.end,o2.end);
                else return Integer.compare(o1.start,o2.start);
            }
        });
        Interval pt = new Interval(intervals.get(0).start,intervals.get(0).end);
        for (int i = 1; i < intervals.size() ; i++) {
            Interval cur = intervals.get(i);
            if(pt.start==cur.start)continue;
            if(pt.end>cur.start){
                pt.end = Math.max(pt.end,cur.end);
            }else{
                list.add(pt);
                pt = new Interval(cur.start,cur.end);
            }
        }
        list.add(pt);
        return list;
    }
    public List<Interval> merge1(List<Interval> intervals){
        List<Interval> list = new ArrayList<>();
        if(intervals == null  || intervals.isEmpty()) return list;
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start==o2.start)
                    return Integer.compare(o1.end,o2.end);
                else return Integer.compare(o1.start,o2.start);
            }
        });
        Interval pt = new Interval(intervals.get(0).start,intervals.get(0).end);
        for (int i = 1; i <intervals.size() ; i++) {
            Interval cur = intervals.get(i);
            if(cur.start==pt.start) continue;
            else if (pt.end> cur.start) pt.end = Math.max(pt.end,cur.end);
            else {
                list.add(pt);
                pt = new Interval(cur.start,cur.end);
            }
        }
        list.add(pt);
        return  list;
    }
}
