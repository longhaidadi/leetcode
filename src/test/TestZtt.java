package test;

/**
 * Created by lon on 16-3-23.
 */
public class TestZtt {
    static {
        System.setProperty( "java.library.path", "/home/lon/workspace/ada-design/leetcode/src/test" );
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary("test");
    }
    public native int setValue(String path);

    public native String getValue(String path,int offset);

    public static void main(String[] args) {
        TestZtt testZtt = new TestZtt();
       // int ret = testZtt.setValue("/home/lon/workspace/ada-design/leetcode/src/data.test");
        //System.out.println(ret);

        String message = testZtt.getValue("/home/lon/workspace/ada-design/leetcode/src/data.test",0);
        System.out.println(message);
    }

}
