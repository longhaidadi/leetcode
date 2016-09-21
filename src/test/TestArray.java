package test;

/**
 * Created by lon on 16-5-6.
 */
public class TestArray {
    public static void main(String[] args) {
        int [][] array = {{1,2},{1,2,3},{1,2}};
        for(int i =0;i<array.length;i++){
            int [] ar = array[i];
            for(int j =0;j<ar.length;j++) {
                System.out.print(ar[j] + "\t");
            }
            System.out.println();
        }
    }
}
