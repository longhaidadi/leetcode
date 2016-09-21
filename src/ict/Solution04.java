package ict;

/**
 * Created by lon on 16-3-28.
 */
public class Solution04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int k = (len1+len2)/2;
        if((len1+len2)%2==1)
            return findMedia(nums1,nums2,0,0,len1,len2,k+1);
        else
            return (findMedia(nums1,nums2,0,0,len1,len2,k)+findMedia(nums1,nums2,0,0,len1,len2,k+1))/2;
    }

    public double findMedia(int [] nums1,int [] nums2,int start1,int start2,int len1,int len2,int k ){
        if(len2<len1)
            return findMedia(nums2,nums1,start2,start1,len2,len1,k);
        if(len1==0)
            return nums2[start2+k-1];


        if(k==1)
            return Math.min(nums1[start1],nums2[start2]);
        int p = Math.min(k/2,len1);
        int c = k-p;
        if(nums1[start1+p-1]==nums2[start2+c-1] )
            return nums1[start1+p-1];
        else if(nums1[start1+p-1]<nums2[start2+c-1]){
            return findMedia(nums1,nums2,start1+p,start2,len1-(p),len2,k-p);
        }else
            return findMedia(nums1,nums2,start1,start2+c,len1,len2-(c),k-c);
    }

    public double findMedia1(int []num1, int [] num2, int start1 ,int start2 ,int len1 ,int len2 , int k){
        if(len1>len2)
            return findMedia(num2,num1,start2,start1,len2,len1,k);
        if(len1==0)
            return num1[start1+k-1];
        if(k==1)
            return Math.min(num1[start1],num2[start2]);
        int p = Math.min(k/2,len1);
        int c = k-p;
        if(num1[start1+p-1]==num2[start2+c-1])
            return num1[start1+p-1];
        else if (num1[start1+p-1]<num2[start2+c-1])
            return findMedia(num1,num2,start1+p,start2,len1-p,len2,k-p);
        else return findMedia(num1,num2,start1,start2+c,len1,len2-c,k-c);
    }

    public static void main(String[] args) {
        //int A[]={1,3,5,7,8,9,10,12,24,45,65};//11
        //int B[]={2,4,6,10,11,12,13,14,17,19,20,34,44,45,66,99};//16
        int A[] = {1};
        int B[] = {1};
        Solution04 solution04 = new Solution04();
        System.out.println(solution04.findMedianSortedArrays(A,B));
    }
}
