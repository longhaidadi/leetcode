package ict.sort;

/**
 * Created by lon on 16-5-12.
 */
/* 插入排序
        * 思路：从序列中第二个元素开始进行遍历，遍历的过程中与
        * 前面（前面的序列已经排好序了）对列进行比较，插入到自
        * 己相应的位置;
        * 时间复杂度：最好O(n)，最坏和平均均为O(n2) 空间复杂度O(1)
        * 评价：如果碰见一个和插入元素相等的，那么插入元素把想
        * 插入的元素放在相等元素的后面。所以，相等元素的前后顺
        * 序没有改变，从原无序序列出去的顺序就是排好序后的顺序，
        * 所以插入排序是稳定的。
*/
public class InsertSort {
    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] array = {3,4,1};
        insertSort.insertSort(array,0,array.length-1);
        for(int a : array)
            System.out.println(a+"\t");
    }

    //找到第一个小于tmp的值的位置,在他的后面插入该值
    public void insertSort(int [] array,int left,int right){
        if(array==null)return;
        for(int i = left+1;i<=right;i++){
            int temp = array[i];
            int j = i-1;
            while (j>=left && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }

    // 通过二分查找,找到刚好一个位置,这个位置是大于tmp的第一个位置,将值更新
    public void binaryInsertSort(int [] array ,int left,int right){
        if(array==null)return;
        int low ;
        int high ;
        for(int i = left;i<right+1;i++){
            int temp = array[i];
            low = left;
            high=i-1;
            while (low<=high){
                int mid = low+((high-low)>>1);
                if(array[mid]<=temp)low=mid+1;
                else high=mid-1;
            }
            for(int k = i-1;k>=low;k--)array[k+1]=array[k];
            array[low]=temp;
        }
    }
}
