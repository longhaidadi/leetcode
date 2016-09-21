package baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lon on 16-5-22.
 */
public class Main {
    private static long array [][];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
           // String line =scanner.nextLine();
          //  String [] array = line.split("\t");
          //  int x = Integer.parseInt(array[0]);
         //   int y = Integer.parseInt(array[1]);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Arrays.fill(array,0);
            System.out.println(helper(x - 1, y - 1, 0, 0) % 1000000007);
        }
    }
    public  static long helper(int n ,int m,int n1 , int m1){
        if(n-n1<=1 || m-m1<=1)return 1;
        int sum = 0;
        for(int i = n1+1;i<n;i++){
            for (int j = m1+1; j <m ; j++) {
                sum += helper(i,j,n1,m1);
            }
        }
        return sum+1;
    }
}
