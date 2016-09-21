package ict;

import java.util.ArrayList;

/**
 * Created by lon on 16-8-4.
 */
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums==null || nums.length<2)return false;
        if(k==0)return true;
        final int limitSize = k;
        final List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        list.add(nums[0]);
        list.add(nums[0]);
        final LinkedHashMap<Integer,Boolean>lru = new LinkedHashMap<Integer, Boolean>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                if(size()>limitSize){
                    int value =(int) eldest.getKey();
                    list.set(2,value);
                    return true;
                }
                return false;
            }
        };
        for (int i = 1; i <nums.length ; i++) {
            lru.put(nums[i],true);

            if(i>=limitSize){
                if(list.get(2)==list.get(1) || list.get(0)==list.get(2)){
                    update(lru,list);
                }
            }
            list.set(0,Math.max(list.get(0),nums[i]));
            list.set(1, Math.min(list.get(1), nums[i]));
            if(Math.abs(nums[i]-list.get(0))>t || Math.abs(nums[i]-list.get(1))>t)return false;
        }
        return true;
    }
    public void update(LinkedHashMap<Integer,Boolean>lru,final List<Integer> list){
        for(Map.Entry<Integer,Boolean>entry: lru.entrySet()){
            int value = entry.getKey();
            if(value==list.get(2))continue;
            list.set(0,Math.max(list.get(0),value));
            list.set(1,Math.min(list.get(1),value));
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2};
        boolean ret = new Solution220().containsNearbyAlmostDuplicate(array,0,1);
        System.out.println(ret);
    }


}
