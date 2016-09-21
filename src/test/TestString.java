package test;

/**
 * Created by lon on 16-3-27.
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab"+"c";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
    }
}
