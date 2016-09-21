package google;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lon on 16-8-28.
 */
public class Main3 {
    static class Interval implements Comparable<Interval>{
        long start;
        long end;

        public Interval(long s, long e){
            start = s;
            end = e;
        }

        public int compareTo(Interval other){
            if(start < other.start) return -1;
            if(start == other.start) return 0;
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t <T ; t++) {
            int N = scanner.nextInt();
            long L1 = scanner.nextLong();
            long R1 = scanner.nextLong();
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long C1 = scanner.nextLong();
            long C2 = scanner.nextLong();
            long M = scanner.nextLong();

            Interval[] inputs = new Interval[N];
            inputs[0] = new Interval(L1, R1);
            for(int i=1; i<N; ++i){
                inputs[i] = new Interval(
                        (A*inputs[i-1].start + B*inputs[i-1].end + C1)%M,
                        (A*inputs[i-1].end + B*inputs[i-1].start + C2)%M
                );
            }

            Interval[] data = new Interval[N];
            data[0] = inputs[0];
            for(int i=1; i<N; ++i){
                data[i] = new Interval(
                        Math.min(inputs[i].start, inputs[i].end),
                        Math.max(inputs[i].start, inputs[i].end)
                );
            }

            long ans = run(data, N);
            output(t+1,ans);
        }
    }

    static long run(Interval[] data, int N){
        if(N<=1) return 0;
        Arrays.sort(data);
        long min = Long.MAX_VALUE;
        for(int i=0; i<N; ++i){
            long value = calc(data, N, i);
            if(value==0) return 0;
            min = Math.min(min, value);
        }
        return min;
    }

    static long calc(Interval[] data, int N, int j){
        int start = 0;
        if(j==0) start = 1;
        long count = data[start].end - data[start].start + 1;
        long lastend = data[start].end;
        for(int i=start+1; i<N; ++i){
            if(i!=j){
                Interval seg = data[i];
                if(seg.start > lastend)
                {
                    count += (seg.end - seg.start + 1);
                    lastend = seg.end;
                }
                else if(seg.end > lastend){
                    count += (seg.end - lastend);
                    lastend = seg.end;
                }
            }
        }
        return count;
    }

    static void output(int index , long ans){
        System.out.println("Case #"+index+": " + ans);
    }
}
