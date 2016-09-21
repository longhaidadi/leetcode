package wap;

import java.util.Scanner;

/**
 * Created by lon on 16-5-22.
 */
public class Main {
    private static TreeNode root = new TreeNode();
    public static class TreeNode{
        TreeNode left;
        TreeNode right;
    }
    public static void buildTree(long val){
        long i = (long)1<<40;
        TreeNode tmp = root;
        for(int j  = 0;  j < 40; j++){
            boolean x = (val&i)!=0?true:false;
            if(x ){
                if(tmp.right==null)
                    tmp.right = new TreeNode();
                tmp=tmp.right;
            }else{
                if(tmp.left==null)
                    tmp.left = new TreeNode();
                tmp=tmp.left;
            }
            i = i>>1;
        }
    }

    public static void run(long [] array){
        long xor = 0;
        for(long a : array){
            xor ^= a;
            buildTree(xor);
        }
        long maxNor = xor;
        long suffix = 0;
        for(int i = array.length-1;i>0;i--){
            suffix ^= array[i];
            maxNor = Math.max(suffix,maxNor);
            maxNor = Math.max(findMax(suffix),maxNor);
        }
        System.out.println(maxNor);

    }

    private static long  findMax(long suffix) {
        TreeNode tmp = root;
        long t = 0;
        long i = (long)1<<40;
        for(int j  = 0;  j < 40; j++){
            t = t<<1;
            boolean x = (suffix&i)!=0?true:false;
            if(x){
                if(tmp.left!=null) {
                    t++;
                    tmp = tmp.left;
                }
                else tmp = tmp.right;
            }else{
                if(tmp.right!=null) {
                    t++;
                    tmp = tmp.right;
                }
                else tmp=tmp.left;
            }
            i = i>>1;

        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        scanner.nextLine();
        long [] array = new long[caseNum];
        for(int i = 0;i<caseNum;i++){
            array[i] = scanner.nextLong();
        }
        run(array);

    }
}
