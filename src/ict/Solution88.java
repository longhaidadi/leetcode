package ict;

/**
 * Created by lon on 16-9-6.
 */
public class Solution88 {
    public void merge(int A[], int m, int B[], int n) {
        int len = m+n;
        while (n>0)A[--len]=(m==0||A[m-1]<B[n-1])?B[--n]:A[--m];
    }

    public void merge1(int A[],int m , int  B[] , int n){
        int len = m+n;
        while (n>0) A[--len] = (m==0 || A[m-1]<B[n-1])?B[--n]:A[--m];
    }
}
