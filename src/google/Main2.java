package google;

import java.util.Scanner;

/**
 * Created by lon on 16-8-28.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = scanner.nextInt();
        for (int i = 0; i <caseNumber ; i++) {
            long ans = run(scanner.nextInt(),scanner.nextInt(),scanner.nextLong(),scanner.nextInt());
            output(i+1,ans);
        }
    }

    static int run(int A,int B , long N, int K){
        long ans = 0;
        for (long i = 1; i <=N ; i++) {
            for (long j = 1; j <=N ; j++) {
                if(i==j) continue;
                long a = PowerMod(i,A,K);
                long b = PowerMod(j,B,K);
                if((a+b)%K==0) ans++;
            }
        }
        return (int)ans%1000000007;
    }

    static void output(int index , long ans){
        System.out.println("Case #"+index+": " + ans);
    }

    static long PowerMod(long a, long b, int c)
    {
        long ans = 1;
        a = a % c;
        while(b>0) {
            if(b % 2 == 1)
            ans = (ans * a) % c;
            b = b/2;
            a = (a * a) % c;
        }
        return ans;
    }
}
