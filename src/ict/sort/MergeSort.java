package ict.sort;

import java.util.Arrays;

/**
 * Created by lon on 16-5-12.
 */
/* 归并排序
        * 思路：归并排序是将两个有序列合并成一个有序列，首先以每一个元素为一个有
        * 序，然后全并成n/2个有序，直到最后合并成一个有序。思路很容易明白，难点
        * 就在于怎么把两个有序序列合并成一个有序序列，也叫二路合并
        * 二路合并:
        * 设r[i…n]由两个有序子表r[i…m]和r[m+1…n]组成，两个子表长度分别为n-i +1、n-m。
        * 1.j=m+1；k=i；i=i; //置两个子表的起始下标及辅助数组的起始下标
        * 2.若i>m 或j>n，转⑷ //其中一个子表已合并完，比较选取结束
        * 3.//选取r[i]和r[j]较小的存入辅助数组rf
        * 如果r[i]
        * 否则，rf[k]=r[j]； j++； k++； 转⑵
        * 4.//将尚未处理完的子表中元素存入rf
        * 如果i<=m，将r[i…m]存入rf[k…n] //前一子表非空
        * 如果j<=n ,  将r[j…n] 存入rf[k…n] //后一子表非空
        * 5.合并结束。
        * 算法时间复杂度：最差、平均和最好都是O(nlogn) 空间复杂度为O(n)
        * 评价：属于稳定排序
        归并排序最难的把两个有序的序列合并成一个有序序列，下面举个列子:
 */
public class MergeSort {

    public static void main(String[] args) {
        int array [] = {1,3,5,2,4,6};
        new MergeSort().mergeSort(array,0,array.length-1);
        for(int a : array)
            System.out.println(a);
    }

    private void mergeSort(int [] array ,int start,int end){
        if(start<end){
            int mid = start + ((end-start)>>1);
            mergeSort(array, start, mid );
            mergeSort(array, mid+1, end);
            merge(array,start,mid,end);
        }
    }
    private void merge(int [] array ,int start,int mid,int end){
        int[] array1 = Arrays.copyOfRange(array,start,mid+1);
        int[] array2 = Arrays.copyOfRange(array,mid+1,end+1);
        int i = 0;
        int j = 0;
        int index = start;
        while (i<=mid-start && j <=end-(mid+1)){
            if(array1[i]<array2[j]){
                array[index]=array1[i];
                i++;
            }else {
                array[index]=array2[j];
                j++;
            }
            index++;
        }

        while (i<=mid-start){
            array[index++]=array1[i++];
        }
        while (j<=end-(mid+1)){
                array[index++]=array2[j++];
        }

    }
}
