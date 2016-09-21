package test;

import sun.org.mozilla.javascript.internal.Synchronizer;

/**
 * Created by lon on 16-8-9.
 */
public class Singleton {
    private Singleton(){}
    private static volatile Singleton instance = null;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
