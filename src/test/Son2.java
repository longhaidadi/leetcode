package test;

/**
 * Created by lon on 16-3-14.
 */
public class Son2 extends Father {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        Son2 son2 = new Son2();
        System.out.println(son2.getA());
        System.out.println(son2.getB());

    }
}
