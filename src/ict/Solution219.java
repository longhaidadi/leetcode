package ict;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lon on 16-8-4.
 */
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        final int finalSize = k;
        LinkedHashMap<Integer,Boolean> lru = new LinkedHashMap<Integer,Boolean>(){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size()>finalSize;
            }
        };
        for (int i : nums) {
            if(lru.containsKey(i))
                return true;
            lru.put(i,true);
        }

        return false;
    }
}
