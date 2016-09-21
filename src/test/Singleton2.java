package test;

/**
 * Created by lon on 16-8-9.
 */
public class Singleton2 {
    private Singleton2(){}
    public static Singleton2 getInstance() {
        return Nest.instance;
    }
    private static class Nest{
        static Singleton2 instance = new Singleton2();
    }
}
