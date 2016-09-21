package ict.sort;

/**
 * Created by lon on 16-5-12.
 */
/* 冒泡排序
        * 思路：第一次依次对前n个数比较（1比2，2比3...)每次最后一个数即为最大的
        * 然后对前n-1个数进行比较,依次类推；每次冒出最值，即冒泡排序
        * 时间复杂度：最坏，平均为O（n2）,最好为O(n) 算法的空间复杂度为O(1)
        * 评价：本算法是就地排序，且是稳定
*/
public class BubbleSort {
    public static void main(String[] args) {
        int array [] = {1,3,5,2,4,6};
        new BubbleSort().bubbleSort(array,0,array.length-1);
        for(int a : array)
            System.out.println(a);
    }
    private void bubbleSort(int array[],int left,int right){
        if(array==null)return;
        for (int i = left; i <right+1 ; i++) {
            boolean flag = false;
            for (int j = right; j >left ; j--) {
                if(array[j]<array[j-1]){
                    flag=true;
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
            if(flag==false)break;
        }
    }
}
