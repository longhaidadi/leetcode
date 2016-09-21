package test;

/**
 * Created by lon on 16-7-28.
 */
public class Test11 {
    private Test11(String a){
        System.out.println(a);
    }
    private static Test11 test11 = new Test11(Test10.t);
    public static Test11 getInstance(){
        return test11;
    }

}
