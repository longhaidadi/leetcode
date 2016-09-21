package test;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by lon on 16-3-17.
 */
public class CurrentHash {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> hashMap = new ConcurrentHashMap<>();
        hashMap.put("", 1);
        hashMap.get("");

        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

    }
}
