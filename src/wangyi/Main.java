package wangyi;

import java.util.Scanner;

/**
 * Created by lon on 16-8-17.
 */
public class Main {
    private static int n =0;
    private static int k =0;
    private static int [] array = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        if(caseNum<=0)return;
        for (int i = 0; i <caseNum ; i++) {

            n = scanner.nextInt();
            k = scanner.nextInt();

            array = new int[2*n];
            for (int j = 0; j < 2*n ; j++) {
                array[j]=scanner.nextInt();
            }
            run();
        }

    }
    private static void run(){

        for (int i = 0; i <k ; i++) {
            int[] tmp = new int[n*2];
            int kk = 0;
            for(int j=0; j<n; j++){
                tmp[kk++] = array[j];
                tmp[kk++] = array[j+n];
            }

            for(int j=0; j<n*2; j++){
                array[j] = tmp[j];
            }
        }
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
