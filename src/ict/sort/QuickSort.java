package ict.sort;


/**
 * Created by lon on 16-4-29.
 */
/* 快速排序
        * 思路：每一个以第一个元素为key值，通过一趟排序将待排记录分割成独立的两部分，
        * 其中一部分元素比关键值大,另一部分元素比关键值小。然后递归得序列
        * 时间复杂度：平均是O（nlogn），最坏O（n^2） 空间复杂度：O（logn）
        * 评价：快速排序是一个不稳定的排序方法，但是平均性能是这些排序算法里面最好的
*/
public class QuickSort {
    public static void main(String[] args) {
        int array [] = {1,3,5,2,4,6};
        new QuickSort().quickSort1(array, 0, array.length - 1, 3);
        for(int a : array)
            System.out.println(a);
    }
    void quickSort(int [] array , int left , int right){
        if(left<right){
            int low = left;
            int high = right;
            int temp = array[left];
            while (low<high) {
                while (low < high && array[high] > temp) high--;
                array[low]=array[high];
                while (low < high && array[low] < temp) low++;
                array[high]=array[low];
            }
            array[low]=temp;
            quickSort(array,left,low-1);
            quickSort(array,low+1,right);
        }


    }
    void  quickSort1(int [] array ,int left , int right,int k){
        if(left<right){
            int low = left;
            int high = right;
            int tmp = array[left];
            while (low<high){
                while (low<high && array[high]>tmp)high--;
                array[low]=array[high];
                while (low<high && array[low]<tmp) low++;
                array[high]=array[low];
            }
            array[low]  = tmp;
            System.out.println("low:" + low + " k:" + k);
            if(low+1==k){
                System.out.println("k:"+k+"\t"+array[low]);
                return;
            }else if(low+1 < k){
                quickSort1(array, low + 1, right, k);
            }else
                quickSort1(array, left, low - 1, k);
        }
    }
}
