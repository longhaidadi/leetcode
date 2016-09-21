package niuke;

/**
 * Created by lon on 16-5-30.
 */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0)return 0;

        int [] data = new int[index+1];
        int u2 = 1;
        int u3 = 1;
        int u5 = 1;
        data[1]=1;

        for(int i = 2 ;i <= index;i++){
            int min = min(data[u2]*2,data[u3]*3,data[u5]*5);
            if(data[u2]*2==min){
                u2++;
            }
            if(data[u3]*3==min){
                u3++;
            }
            if (data[u5]*5==min){
                u5++;
            }
            data[i]=min;
        }

        return data[index];
    }
    int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }

    public static void main(String[] args) {
        new GetUglyNumber_Solution().GetUglyNumber_Solution(7);
    }
}
