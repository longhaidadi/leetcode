package test;

/**
 * Created by lon on 16-8-9.
 */
public class Singleton3 {
    private Singleton3(){}
    private static Singleton3 instance = new Singleton3();
    public static Singleton3 getInstance() {
        return instance;
    }
}
