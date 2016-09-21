package ict.sort;

/**
 * Created by lon on 16-5-12.
 */
/* 堆排序
        * 思路：把元素序列建成一个最大堆或最小堆，每次的堆顶元素为最值
        * 每次取出堆顶元素，然后重新建堆，直到最后一个元素
        * 时间复杂度：最好、最坏和平均都为O（nlogn）空间复杂度为O(1)
        *
*/
public class HeapSort {
    public static void main(String[] args) {
        int array [] = {1,3,5,2,4,6};
        new HeapSort().heapSort(array);
        for(int a : array)
            System.out.println(a);
    }
    public void heapSort(int[] array){
        buildMaxHeap(array);
        for(int i = 0;i<array.length;i++){
            int tmp = array[0];
            array[0]=array[array.length-1-i];
            array[array.length-i-1]=tmp;
            heapModify(array,0,array.length-i-1);
        }
    }
    private void buildMaxHeap(int [] array ){
        int mid = (array.length-1)/2;
        for(int i =mid;i>=0;i--){
            heapModify(array,i,array.length);
        }
    }
    private void heapModify(int [] array , int parentIndex, int heapSize){
        int leftIndex = parentIndex*2+1;
        int rightIndex = parentIndex*2+2;
        int largestIndex = parentIndex;
        if(heapSize-1>=leftIndex&&array[largestIndex]<array[leftIndex])largestIndex=leftIndex;
        if(heapSize-1>=rightIndex&&array[largestIndex]<array[rightIndex])largestIndex=rightIndex;
        int tmp = array[parentIndex];
        array[parentIndex]=array[largestIndex];
        array[largestIndex]=tmp;
        if(largestIndex!=parentIndex){
            heapModify(array,largestIndex,heapSize);
        }
    }



}
