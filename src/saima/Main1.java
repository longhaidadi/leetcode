package saima;

import java.util.Scanner;

/**
 * Created by lon on 16-8-30.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(run(l,r,m));
    }
    static int  run(int l ,int r , int m){
        int ans = 0;
        for (int i = l; i <= r; i++) {
            if(getBit(i)==m)ans++;
        }
        return ans;
    }

    private static int getBit(int i) {
        int bit = 0;
        while (i!=0){
            i = i&(i-1);
            bit++;
        }
        return bit;
    }
}
