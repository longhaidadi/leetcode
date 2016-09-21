package test;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by lon on 16-4-6.
 */
public class Test3 {
    private static volatile   AtomicLong l=new AtomicLong(0);
    public static void main(String[] args) {
        for (int i = 1; i <=101 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j <1 ; j++) {
                        l.addAndGet(1);
                    }
                }
            }).start();
        }
        System.out.println(l);
    }

}
