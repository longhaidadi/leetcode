package ict.sort;

/**
 * Created by lon on 16-7-24.
 */
public class RadixSort {
    public int getDigit (int x , int d){
        int a[] = {1,1,10,100};
        return ((x/a[d])%10);
    }
    public void radixSort(int [] list , int begin ,int end,int digit){
        final  int radix = 10;
        int [] count = new int[radix];
        int [] bucket = new int[end-begin+1];
        // 从低到高的顺序进行排序过程
        for (int d = 1; d <=digit ; d++) {
            //
            for (int i = 0; i <radix ; i++) {
                count[i]=0;
            }
            for (int i = begin; i <= end ; i++) {
                int j = getDigit(list[i],d);
                count[j]++;
            }

            for (int i = 1; i < radix; i++) {
                count[i]= count[i]+count[i-1];
            }

        }
    }
}
