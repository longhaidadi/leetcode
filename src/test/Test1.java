package test;

/**
 * Created by lon on 16-7-26.
 */
public class Test1 {
    public int run(int n){
        return (n!=0)?(run(n-1)+n):0;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.run(10);
        System.out.println( test1.run(10));
    }
    public  void run(){
        int ab  = 1;
        int c = 0;

    }


}
